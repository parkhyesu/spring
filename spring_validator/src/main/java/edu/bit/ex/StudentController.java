package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping("/studentForm")
	public String studentForm() {
		return "createPage";
	}
	

	@RequestMapping("/student/create")

	public String studentCreate(@Valid Student student, BindingResult result) {
		
		String page = "createDonePage";
		
		//StudentValidator validator = new StudentValidator(); 
		//validator.validate(student, result);
		
		if(result.hasErrors()) {
			page = "createPage";
		}
		
		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}
	
	/*
	 * @RequestMapping("/student/create") //Validate 를 써먹기 위해서는 BindingResult 필요
	 * public String studentCreate(Student student, BindingResult result) {
	 * 
	 * String page = "createDonePage";
	 * 
	 * //검증하기 시작해라 부분. StudentValidator validator = new StudentValidator(); //다형성
	 * 적용됨. validator.validate(student, result);
	 * 
	 * //error 가 있으면 true 를 리턴함. if(result.hasErrors()) { page = "createPage"; }
	 * 
	 * return page; }
	 */
	
	
	
	
}
