package com.javalec.ex;

public class Grade {

	
	
	public void gradeCalculation(int korean, int math, int eng) {
		
		int result = (korean + math + eng)/3;
		
		if(result >  90) {
			System.out.println("등급 : 수");
		}else if(result > 80) {
			System.out.println("등급 : 우");
		}else if (result > 70) {
			System.out.println("등급 : 미");
		}else if (result > 60) {
			System.out.println("등급 : 양");
		}else {
			System.out.println("등급 : 가");
		}
	}
}
