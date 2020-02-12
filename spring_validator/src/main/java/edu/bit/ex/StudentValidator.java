package edu.bit.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		//검증할 객체의 클래스 타입 정보
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		System.out.println("validate() 호출");
		//student 를 검증하기 위해 형변환
		Student student = (Student) obj;
		
		//검증할 내용 가져오기
		String studentName = student.getName();
		//검증. null 이거나 잘라냈는데 아무것도 없다면.
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("studentName is null or empty");
			//name 에 trouble 이 있다는 에러 
			errors.rejectValue("name", "trouble");
		}
		
		int studentId = student.getId();
		//int 의 초기값인 0이라면 아무것도 안넣은 상태라는거니까.
		if(studentId == 0) {
			System.out.println("studentId is 0");
			errors.rejectValue("id", "trouble");
	
			
		}
			
	}	
}
