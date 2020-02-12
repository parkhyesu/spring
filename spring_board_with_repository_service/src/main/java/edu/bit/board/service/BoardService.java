package edu.bit.board.service;

import java.util.List;

import edu.bit.board.vo.BoardVO;

//전에 Command 로 했던거.
public interface BoardService {

	List<BoardVO> getBoardList();
	
	int boardWrite(String bName, String bTitle, String bContent);
	
	
}
