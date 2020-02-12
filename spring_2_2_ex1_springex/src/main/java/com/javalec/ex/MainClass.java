package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
			
		 String configLocation = "classpath:appCTX3.xml"; 
		 AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		 
		StudentInfo2 student1 = ctx.getBean("student", StudentInfo2.class); 
		student1.setName("홍길동");
		student1.setEng(100);
		student1.setKorean(70);
		student1.setMath(80);
		student1.myGrade();
		
		/*
		 * String configLocation = "classpath:appCTX3.xml"; AbstractApplicationContext
		 * ctx = new GenericXmlApplicationContext(configLocation);
		 * 
		 * Circle circle = ctx.getBean("circle", Circle.class); circle.setRadius(10);
		 * System.out.println(circle.getCircle());
		 */	 
			
		

				/*
				 * String configLocation = "classpath:appCTX2.xml"; AbstractApplicationContext
				 * ctx = new GenericXmlApplicationContext(configLocation);
				 * 
				 * MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
				 * 
				 * //최종적으로 이거 호출하려고 만든 것. myInfo.getInfo();
				 */
				 

					
		
		
		
		/*
		 * //스프링 활용
		 * 
		 * String configLocation = "classpath:appCTX.xml";
		 * 
		 * //GenecicXmlApplicationContext : 얘가 IOC 컨테이너. 스프링. AbstractApplicationContext
		 * ctx = new GenericXmlApplicationContext(configLocation);
		 * 
		 * //예전에 new 로 생성을 하던거를 이런 방식으로 MyCalculation myCalculator =
		 * ctx.getBean("myCalculator", MyCalculation.class);
		 * 
		 * myCalculator.add(); myCalculator.sub(); myCalculator.mul();
		 * myCalculator.div();
		 */
		
		
		
		/*
		 * MyCalculation myCalculator = new MyCalculation(); //주입
		 * myCalculator.setCalculator(new Calculation());
		 * 
		 * myCalculator.setFirstNum(10); myCalculator.setSecondNum(2);
		 * 
		 * myCalculator.add(); myCalculator.sub(); myCalculator.mul();
		 * myCalculator.div();
		 */
		
		
	}
	
}
