package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//첫번째 방법.

@Controller
public class BController2 {

	@Autowired
	BService2 bService;
	
	@RequestMapping("/list2")
	public String list2(Model model) throws Exception{
		System.out.println("list2()");
		
		model.addAttribute("list", bService.selectBoardList());
		return "list";
	}
}
