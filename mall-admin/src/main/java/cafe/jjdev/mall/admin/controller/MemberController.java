package cafe.jjdev.mall.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cafe.jjdev.mall.admin.service.MemberService;
import cafe.jjdev.mall.admin.vo.Member;

@Controller
public class MemberController {
	@Autowired MemberService memberService;
	
	// 관리자 로그아웃
	@GetMapping("/admin/adminLogout")
	public String adminLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	// 관리자 로그인
	@GetMapping("/admin/adminLogin")
	public String getMember(HttpSession session) {
		if(session.getAttribute("loginAdmin") != null) {
			return "redirect:/";
		}
		else {
			return "/admin/adminLogin";
		}
	}
	
	@PostMapping("/admin/adminLogin")
	public String getMember(HttpSession session, Member member) {
		if(memberService.getMember(member) == null) {
			return "redirect:/admin/adminLogin";
		}
		else {
			session.setAttribute("loginAdmin", memberService.getMember(member));
			return "redirect:/";
		}
	}
}
