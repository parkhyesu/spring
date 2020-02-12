package edu.bit.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/board")
public class HomeController {
	
	@RequestMapping("/reply")
	//Model 이랑 View 를 직접 지정해주는것.
	public ModelAndView reply(Model model) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id", 30);
		
		mv.setViewName("/board/reply");
		
		
		return mv;
	}

	@RequestMapping("/write")
	public String write(Model model) {
		
		model.addAttribute("id", 30);
		return "board/write";
	}
}
