package cafe.jjdev.mall.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cafe.jjdev.mall.admin.service.CategoryService;
import cafe.jjdev.mall.admin.vo.Category;

@Controller
public class CategoryController {
	@Autowired CategoryService categoryService;
	
	@GetMapping("/category/getCategoryList")
	public String getCategoryList() {
		return "/category/getCategoryList";
	}
	
	@GetMapping("/category/addCategory")
	public String addCategory(HttpSession session) {
		if(session.getAttribute("loginAdmin") == null) {
			return "redirect:/";
		}
		else {
			return "/category/addCategory";
		}
	}
	
	@PostMapping("/category/addCategory")
	public String addCategory(Category category) {
		System.out.println("=== CategoryController.addCategory ===");
		categoryService.addCategory(category);
		return "redirect:/category/getCategoryList";
	}
	
}
