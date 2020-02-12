package edu.bit.ex.board4;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

//이건 객체 생성 new
@Service
public class BService4 {
	
	@Inject
	BoardMapper4 boardMapper;
	
	public List<BoardVO> selectBoardList() throws Exception{
		return boardMapper.selectBoardList1();
	}

}
