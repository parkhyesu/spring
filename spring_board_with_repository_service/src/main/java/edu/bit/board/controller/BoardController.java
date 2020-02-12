package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		
		List<BoardVO> list = boardService.getBoardList();
		
		model.addAttribute("list",list);
		
		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	
	@RequestMapping("/write")
	//폼태그의 name 과 BoardVO 의 변수명을 같게하고
	//이렇게 커맨드 객체로 넘기면 지가 알아서 set 함수 호출해서
	//알아서 넣어줌...
	public String write(BoardVO boardVO) {
		System.out.println("write()");
		
		int rn = boardService.boardWrite(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());
		
		System.out.println("결과값 : " + rn);
		
		//redirect 로 해서 컨트롤러 다시 타게 해야함.
		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		System.out.println("content_view()");
		
		BoardVO boardVO = boardService.boardContentView();
		
		return "content_view";
	}


}
