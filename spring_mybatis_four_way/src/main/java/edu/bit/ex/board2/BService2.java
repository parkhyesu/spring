package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

//이건 객체 생성 new
@Service
public class BService2 {
	
	
	//@Autowired 써도 됨.
	//root-context 에서 생성했던거 주소 가져오는것(객체 주입).
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception{
		
		//sqlSession 안에 selectList 라는 함수가 존재함. 그거 가져다 쓰는것.
		
		return sqlSession.selectList("board.selectBoardList");
	}

}
