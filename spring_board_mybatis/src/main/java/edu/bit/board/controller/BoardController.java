package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");

		List<BoardVO> list = boardService.selectBoardList();

		model.addAttribute("list", list);

		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view(Model model) {

		return "write_view";
	}

	@RequestMapping("/write")
	public String write(BoardVO boardVO, Model model) {
		System.out.println("write()");

		//1번, 2번 같은 기능임
		//1번
		boardService.insertBoardVO(boardVO);
		//2번
		boardService.insertBoard(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());

		return "redirect:list";
	}

	
	 @RequestMapping("/content_view") 
	 public String content_view(String bId, Model model) { 
		 System.out.println("content_view()");
	 
		 model.addAttribute("content_view", boardService.selectBoardContent(bId));
	 
		 return "content_view"; 
	}
	 
	 @RequestMapping("/modify") 
	 public String modify(String bId, String bName, String bTitle, String bContent) { 
		 System.out.println("modify()");
	 
		boardService.modify(bId, bName, bTitle, bContent);
	 
		 return "redirect:list"; 
	}
	 
	 @RequestMapping("/delete") 
	 public String delete(String bId) { 
		 System.out.println("delete()");
	 
		boardService.delete(bId);
	 
		 return "redirect:list"; 
	}
	
	 @RequestMapping("/reply_view") 
	 public String reply_view(String bId) { 
		 System.out.println("reply_view()");
	 
		 boardService.selectBoardReply(bId);
		
		 return "reply_view"; 
	}
	 
}
