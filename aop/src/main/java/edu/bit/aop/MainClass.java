package edu.bit.aop;

public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("Hello World");
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:root-context.xml");
		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();
		
		ctx.close();
	}

}
