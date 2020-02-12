package edu.bit.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.bit.board.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> selectBoardList();
	
	//�Ķ���Ͱ� �ΰ� �̻��϶��� @Param �־����. �ϳ��϶��� �������൵ #{} �ص� �˾Ƶ�´�.
	//���� : board.xml �� �־��ٶ� Param ���� ������ �̸� #{} ���� ������ ��.
	
	//1��
	public void insertBoard(@Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	//2����
	public void insertBoardVO(@Param("boardVO")BoardVO boardVO);
	
	public BoardVO selectBoardContent(@Param("bId")String bId);
	
	public void modify(@Param("bId")String bId, @Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	
	public void delete(@Param("bId")String bId);
	
	public BoardVO selectBoardReply(@Param("bId")String bId);

	public void reply(String bName, String bTitle, String bContent);
}
