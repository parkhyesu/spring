package edu.bit.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		//������ ��ü�� Ŭ���� Ÿ�� ����
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		System.out.println("validate() ȣ��");
		//student �� �����ϱ� ���� ����ȯ
		Student student = (Student) obj;
		
		//������ ���� ��������
		String studentName = student.getName();
		//����. null �̰ų� �߶�´µ� �ƹ��͵� ���ٸ�.
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("studentName is null or empty");
			//name �� trouble �� �ִٴ� ���� 
			errors.rejectValue("name", "trouble");
		}
		
		int studentId = student.getId();
		//int �� �ʱⰪ�� 0�̶�� �ƹ��͵� �ȳ��� ���¶�°Ŵϱ�.
		if(studentId == 0) {
			System.out.println("studentId is 0");
			errors.rejectValue("id", "trouble");
	
			
		}
			
	}	
}