package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

//�̰� ��ü ���� new
@Service
public class BService2 {
	
	
	//@Autowired �ᵵ ��.
	//root-context ���� �����ߴ��� �ּ� �������°�(��ü ����).
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception{
		
		//sqlSession �ȿ� selectList ��� �Լ��� ������. �װ� ������ ���°�.
		
		return sqlSession.selectList("board.selectBoardList");
	}

}
