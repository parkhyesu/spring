package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ContentController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//  /로 치고 들어오고 get 방식이면 이 함수를 실행시킨다.
	// 이 함수는 DispatcherServlet 가 호출해 주는것.
	// Model model 에 주소값 넣어주는 것(객체생성해주는것)도 DispatcherServlet. 호출해주면서 넣어준다.
	@RequestMapping(value = "/board/content", method = RequestMethod.GET)
	public String content(Model model) {
		logger.info("/board/content 실행");
		
		model.addAttribute("id", 30);
		return "home";
	}
	
	
	
}
