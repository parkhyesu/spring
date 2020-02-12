package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.board.service.EmpService;
import edu.bit.board.vo.EmpVO;


@RestController
@RequestMapping("/rest/*")
public class EmpController {

	@Autowired
	EmpService empService;

	@ResponseBody
	@RequestMapping("/emp")
	public List<EmpVO> list(Model model) {
		System.out.println("list()");

		List<EmpVO> dto = empService.selectEmpList();
		
		return dto;
	}
	
	

}
