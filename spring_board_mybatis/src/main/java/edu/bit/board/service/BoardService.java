package edu.bit.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.bit.board.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> selectBoardList();
	
	//파라미터가 두개 이상일때는 @Param 넣어줘라. 하나일때는 안적어줘도 #{} 해도 알아듣는다.
	//역할 : board.xml 에 넣어줄때 Param 으로 정해준 이름 #{} 으로 넣으면 됨.
	
	//1번
	public void insertBoard(@Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	//2번ㄴ
	public void insertBoardVO(@Param("boardVO")BoardVO boardVO);
	
	public BoardVO selectBoardContent(@Param("bId")String bId);
	
	public void modify(@Param("bId")String bId, @Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	
	public void delete(@Param("bId")String bId);
	
	public BoardVO selectBoardReply(@Param("bId")String bId);

	public void reply(String bName, String bTitle, String bContent);
}
