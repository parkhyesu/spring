package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.dao.BoardDAO;
import edu.bit.board.vo.BoardVO;

//id = "boardService 로 bean 객체 생성시켜놔라.명령
@Service("boardService")
public class BoardServiceImpl implements BoardService{

	//Autowired : 객체를 자동으로 주입시켜줌
	//이게 없으면 변수만 있는건데, 써주면 BoardDAO boardDAO = new BoardDAO(); 이 기능
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList() {
		
		return boardDAO.getBoardList();
	}

	@Override
	public int boardWrite(String bName, String bTitle, String bContent) {
		return boardDAO.write(bName, bTitle, bContent);
	}

	
}
