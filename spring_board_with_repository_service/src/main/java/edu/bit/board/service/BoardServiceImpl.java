package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.dao.BoardDAO;
import edu.bit.board.vo.BoardVO;

//id = "boardService �� bean ��ü �������ѳ���.���
@Service("boardService")
public class BoardServiceImpl implements BoardService{

	//Autowired : ��ü�� �ڵ����� ���Խ�����
	//�̰� ������ ������ �ִ°ǵ�, ���ָ� BoardDAO boardDAO = new BoardDAO(); �� ���
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
