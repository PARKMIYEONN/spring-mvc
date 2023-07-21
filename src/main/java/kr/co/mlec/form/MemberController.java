package kr.co.mlec.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class MemberController {
	
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
//	@RequestMapping("/join.do")
//	public String join(HttpServletRequest request) {
//		
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		String name = request.getParameter("name");
//		MemberVO member = new MemberVO();
//		member.setId(id);
//		member.setPassword(password);
//		member.setName(name);
//		request.setAttribute("member", member);
//	
//		return "form/memberInfo";
//		}
	
	@RequestMapping("/join.do")
						//클래스 이름이 아닌 내가 원하는 이름으로 등록을 하고 싶을 때 붙이는 어노테이션
	public String join(@ModelAttribute("member") MemberVO member) {
		
		return "form/memberInfo";
	}

}
