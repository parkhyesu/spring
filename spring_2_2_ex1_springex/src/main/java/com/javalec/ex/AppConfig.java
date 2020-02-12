package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student2 student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student2 student = new Student2("홍길동",20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
	
	@Bean
	public Student2 student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("음악감상");
		
		Student2 student = new Student2("홍길동2",30, hobbys);
		student.setHeight(170);
		student.setWeight(60);
		
		return student;
	}
	
	@Bean
	public Rectangle rectangle() {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(5);
		rectangle.setHeight(10);
		return rectangle;
		
		
	}
	
	
}
