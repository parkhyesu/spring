package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper4 {

	public List<BoardVO> selectBoardList();
	
	@Select
	("select bId from mvc_board order by bGroup desc, bStep asc")
	public List<BoardVO> selectBoardList1();
}
