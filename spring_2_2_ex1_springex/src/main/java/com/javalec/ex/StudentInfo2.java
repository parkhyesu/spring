package com.javalec.ex;

public class StudentInfo2 {

	private Grade grade;
	private String name;
	private int korean;
	private int math;
	private int eng;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public void grade() {
		grade.gradeCalculation(korean, math, eng);
	}
	
	public void myGrade() {
		System.out.println("이름 : " + name);
		grade();
	}
}
