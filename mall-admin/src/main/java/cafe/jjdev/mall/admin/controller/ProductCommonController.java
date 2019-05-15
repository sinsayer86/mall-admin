package cafe.jjdev.mall.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cafe.jjdev.mall.admin.service.CategoryService;
import cafe.jjdev.mall.admin.service.ProductCommonService;
import cafe.jjdev.mall.admin.vo.Product;
import cafe.jjdev.mall.admin.vo.ProductCommon;

@Controller
public class ProductCommonController {
	@Autowired private CategoryService categoryService;
	@Autowired private ProductCommonService productCommonService;
	
	@GetMapping("/product/addProductCommonList")
	public String addProductCommonList(HttpSession session, Model model, @RequestParam(required = false, defaultValue = "1") int currentPage) {
		if(session.getAttribute("loginAdmin") == null) {
			return "redirect:/";
		}
		else {
			
			return "/product/addProductCommon";
		}
	}
	
	@GetMapping("/product/addProductCommon")
	public String addProductCommon(HttpSession session, Model model) {
		if(session.getAttribute("loginAdmin") == null) {
			return "redirect:/";
		}
		else {
			model.addAttribute("categoryList", categoryService.getCategoryList());
			return "/product/addProductCommon";
		}
	}
	
	@PostMapping("/product/addProductCommon")
	public String addProductCommon(ProductCommon productCommon, Product product) {
		System.out.println(productCommon + " <- productCommon |ProductCommonController.addProductCommon post");
		System.out.println(product + " <- product |ProductCommonController.addProductCommon post");
		int result = productCommonService.addProductCommon(productCommon, product);
		
		if(result == 0) {
			return "redirect:/product/addProductCommon";
		}
		else {
			return "redirect:/";
		}
	}
}
