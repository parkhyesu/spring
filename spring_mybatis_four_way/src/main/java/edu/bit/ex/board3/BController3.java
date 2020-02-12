package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//첫번째 방법.

@Controller
public class BController3 {

	@Autowired
	BService3 bService;
	
	@RequestMapping("/list3")
	public String list3(Model model) throws Exception{
		System.out.println("list3()");
		
		model.addAttribute("list", bService.selectBoardList());
		return "list";
	}
	
}
