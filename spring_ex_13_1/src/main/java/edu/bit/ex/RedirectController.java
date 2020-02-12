package edu.bit.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RedirectController {
	
	@RequestMapping("/studentConfirm")
	public String studentConfirm(HttpServletRequest req, Model model) {
		
		String id = req.getParameter("id");
		
		if(id.equals("abc")) {
		
		//studentOk.jsp �� �ƴ϶� /studentOk �� URL�� ����.
			return "forward:studentOk";
		}
		
		////studentNg.jsp �� �ƴ϶� /studentNg �� URL�� ����.
		return "forward:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk(Model model) {
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg(Model model) {
		return "student/studentNg";
	}
	
	@RequestMapping("circle")
	public String circle() {
		return "circle";
	}
	
	@RequestMapping("circleArea")
	public String circle(Circle circle) {
		
		
		return "circleArea";
	}
	
	
	
	
}
