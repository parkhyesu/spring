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
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//  /로 치고 들어오고 get 방식이면 이 함수를 실행시킨다.
	// 이 함수는 DispatcherServlet 가 호출해 주는것.
	// Model model 에 주소값 넣어주는 것(객체생성해주는것)도 DispatcherServlet. 호출해주면서 넣어준다.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		//return 하는것은 결국 home.jsp 이다.
		return "home";
	}
	
	@RequestMapping(value = "/board/View", method = RequestMethod.GET)
	public String view() {
		logger.info("/board/View 실행");
		
		//이렇게 만들면 views 폴더 안에 board 폴더 만들고 그 안에 view.jsp 만들어야함
		return "board/view";
	}
	
	@RequestMapping(value = "/board/content")
	public String content(Model model) {
		
		model.addAttribute("id", 30);
		return "board/content";
	}
	
}
