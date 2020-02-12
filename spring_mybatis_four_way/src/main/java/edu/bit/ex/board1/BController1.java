package edu.bit.ex.board1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//첫번째 방법.

@Controller
public class BController1 {

	@Autowired
	BService1 bService;
	
	@RequestMapping("/list1")
	public String list1(Model model) throws Exception{
		System.out.println("list1()");
		
		model.addAttribute("list", bService.selectBoardList());
		return "list";
	}
	
}
