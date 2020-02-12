package edu.bit.ex.board3;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

//이건 객체 생성 new
@Service
public class BService3 {
	
	
	@Inject
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoardList() throws Exception{
		return boardMapper.selectBoardList();
	}

}
