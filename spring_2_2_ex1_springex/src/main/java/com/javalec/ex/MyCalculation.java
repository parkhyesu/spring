package com.javalec.ex;

public class MyCalculation {
	
	Calculation calculator;
	private int firstNum;
	private int secondNum;
	
	
	//위에서 객체 생성을 하지 않았으니까 set 함수 통해서 calculator 객체 만들어야
	//밑에있는 함수 안에있는 calculator.함수 를 쓸수 있다.
	public void setCalculator(Calculation calculator) {
		this.calculator = calculator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public MyCalculation() {
		
	}

	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}

	
	
}
