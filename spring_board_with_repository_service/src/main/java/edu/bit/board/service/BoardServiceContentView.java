package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.bit.board.dao.BoardDAO;
import edu.bit.board.vo.BoardVO;

public class BoardServiceContentView implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int boardWrite(String bName, String bTitle, String bContent) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public BoardVO boardContentView(String strId) {
		
		return boardDAO.contentView(strId);
	}

	
	

}
