package edu.bit.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.page.Criteria;
import edu.bit.board.vo.BoardVO;

//媛앹껜 �깮�꽦�쓣 �쐞�븳 �뼱�끂�뀒�씠�뀡 二쇱쓽(源뚮㉨�쑝硫� 怨ㅻ��빐吏�)
//�꽌鍮꾩뒪�뿉�꽌�뒗 鍮꾩쫰�땲�뒪 濡쒖쭅�씠 �뱾�뼱媛�
@Service
public class BoardService {
	@Inject
	BoardMapper boardMapper;
	
    public List<BoardVO> selectBoardList()  {
		return boardMapper.selectBoardList();
    }
    
	//@Transactional(propagation=Propagation.REQUIRES_NEW)  
	//@Transactional()  
    public void insertBoard(BoardVO boardVO)  {
    	boardMapper.insertBoard(boardVO);
    	
    	System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
    }

    public BoardVO selectBoardOne(String bId)  {
		return boardMapper.selectBoardOne(bId);
    }
    
    public List<BoardVO> selectBoardListPage(Criteria criteria)  {
		return boardMapper.selectBoardListPage(criteria);
    }
    
    public int selectAllBoard() {
		return boardMapper.selectAllBoard();
    }
    
    public void updateShape(BoardVO param)  {
    	boardMapper.updateShape(param);
    }
    
    public void insertReply(BoardVO param)  {
    	boardMapper.insertReply(param);
    }
    
    //트랜잭션 테스트
    //@Transactional
    public void transactionTest(BoardVO boardVO) {
    	insertBoard(boardVO);
    	
    	boardVO = null;
    	
    	insertBoard(boardVO);     	
    }
    
    //@Transactional()
	//@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void tranTest() 
	{
		
		System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
/*		
		try {*/
			
			BoardVO bo = new BoardVO();
			bo.setbName("�횑쨍짠");
			bo.setbContent("횆횁횇횢횄첨");
			bo.setbTitle("횁짝쨍챰");	
			
			boardMapper.insertBoard(bo);
			bo=null;
			boardMapper.insertBoard(bo);	
			
/*		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/

	}
    
    /*
    public List<BoardVO> selectBoardListPage(Criteria criteria)  {
		return sqlSession.selectList("selectBoardListPage",criteria);
    }
    
    public int selectTotal() throws Exception {
		return sqlSession.selectOne("selectTotal");
    }
    
    public void updateShape(BoardVO param) throws Exception {
		sqlSession.insert("updateShape", param);
    }
    
    public void insertReply(BoardVO param) throws Exception {
		sqlSession.insert("insertReply", param);
    }
    
    public void updateBoard(BoardVO param) throws Exception {
		sqlSession.insert("updateBoard1", param);
    }
     
    public BoardVO selectBoardOne(String bId) throws Exception {
		return sqlSession.selectOne("selectBoardOne", bId);
    }
    public void deleteBoardOne(String bId) throws Exception {
		sqlSession.delete("deleteBoardOne", bId);
    }
    */


    
}