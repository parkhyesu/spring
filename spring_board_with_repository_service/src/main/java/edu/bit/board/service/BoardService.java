package edu.bit.board.service;

import java.util.List;

import edu.bit.board.vo.BoardVO;

//���� Command �� �ߴ���.
public interface BoardService {

	List<BoardVO> getBoardList();
	
	int boardWrite(String bName, String bTitle, String bContent);
	
	
}
