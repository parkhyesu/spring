package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.bit.ex.member.Member;
import edu.bit.ex.student.StudentInformation;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("board/confirm")
	public String confirm(HttpServletRequest req, Model model) {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/confirm";
	}
	
	@RequestMapping("board/check")
	public String check(@RequestParam("id") String id,
						 @RequestParam("pw") int pw,
						 Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/check";
	}
	
	@RequestMapping("/member/join")
	public String join(Member member) {
				
		
		return "member/join";
	}
	
	@RequestMapping("/index")
	public String index() {
				
		
		return "index";
	}
	
	@RequestMapping(value="/student", method= RequestMethod.POST)
	public String student(HttpServletRequest req, Model model) {
		
		logger.info("RequestMethod.POST");
		String id = req.getParameter("id");
		
		model.addAttribute("id", id);
		
		return "student";
	}
	
	
	
	@RequestMapping(value="/studentView", method=RequestMethod.POST)
	public String studentView(@ModelAttribute("studentInfo")
								StudentInformation studentInformation) {
		
		
		return "studentView";
	}
	
}
