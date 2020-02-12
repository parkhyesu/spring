package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

//�̰� ��ü ���� new
@Service
public class BService1 {
	
	
	//@Autowired �ᵵ ��.
	//root-context ���� �����ߴ��� �ּ� �������°�(��ü ����).
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception{
		//
		IBDao dao = sqlSession.getMapper(IBDao.class);
		
		return dao.listDao();
	}

}
