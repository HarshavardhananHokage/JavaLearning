package com.harsh.java.features.eight.mref;

public class Assignment1Main {

	public static void main(String[] args) {
		
//		MathOperation add = (a, b) -> a + b;
//		MathOperation sub = (a, b) -> a - b;
//		MathOperation mul = (a, b) -> a * b;
//		MathOperation div = (a, b) -> a / b;
		
		MathOperation addRef = Math::addExact;
		MathOperation subRef = Math::subtractExact;
		MathOperation mulRef = Math::multiplyExact;
		MathOperation divRef = Math::floorDiv;
		
		MathOperation add = (int a, int b) -> a + b;
		System.out.println(calculate(add));
		
//		
//		System.out.println(calculate(add));
//		System.out.println(calculate(sub));
//		System.out.println(calculate(mul));
//		System.out.println(calculate(div));
		
//		int onScreenNumber = calculate(5, addRef, 2);
//		onScreenNumber = calculate (onScreenNumber, subRef, 3);
//		onScreenNumber = calculate (onScreenNumber, mulRef, 7);
//		onScreenNumber = calculate (onScreenNumber, addRef, 2);
//		onScreenNumber = calculate (onScreenNumber, divRef, 3);
//		System.out.println(onScreenNumber);

	}
	
	private static int calculate(MathOperation operation) {
		int a = 100;
		int b = 5;
		
		return operation.operate(a, b);
	}
	
	private static int calculate(int onScreenNumber, MathOperation operation, int enteredNumber) {
		
		return operation.operate(onScreenNumber, enteredNumber);
	}

}