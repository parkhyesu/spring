package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//첫번째 방법.

@Controller
public class BController4 {

	@Autowired
	BService4 bService;
	
	@RequestMapping("/list4")
	public String list3(Model model) throws Exception{
		System.out.println("list4()");
		
		model.addAttribute("list", bService.selectBoardList());
		return "list";
	}
}
