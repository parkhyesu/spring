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
	
	//  /�� ġ�� ������ get ����̸� �� �Լ��� �����Ų��.
	// �� �Լ��� DispatcherServlet �� ȣ���� �ִ°�.
	// Model model �� �ּҰ� �־��ִ� ��(��ü�������ִ°�)�� DispatcherServlet. ȣ�����ָ鼭 �־��ش�.
	@RequestMapping(value = "/board/content", method = RequestMethod.GET)
	public String content(Model model) {
		logger.info("/board/content ����");
		
		model.addAttribute("id", 30);
		return "home";
	}
	
	
	
}
