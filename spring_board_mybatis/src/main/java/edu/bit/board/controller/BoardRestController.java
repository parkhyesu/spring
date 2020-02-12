package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;


@RestController
@RequestMapping("/rest/*")
public class BoardRestController {

	@Autowired
	BoardService boardService;

	@RequestMapping("/list")
	public List<BoardVO> list() {
		System.out.println("list()");

		return boardService.selectBoardList();
	}

}
