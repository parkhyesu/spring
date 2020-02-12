package edu.bit.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.bit.board.vo.EmpVO;

public interface EmpService {

	@Select("select * from emp")
	public List<EmpVO> selectEmpList();
}
