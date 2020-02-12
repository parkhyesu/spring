package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

//이건 객체 생성 new
@Service
public class BService1 {
	
	
	//@Autowired 써도 됨.
	//root-context 에서 생성했던거 주소 가져오는것(객체 주입).
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception{
		//
		IBDao dao = sqlSession.getMapper(IBDao.class);
		
		return dao.listDao();
	}

}
