package com.qa.demo;

public class HelloWorld {

	public static void main(String[] args) {
		methondOne();
		
	}

	public static void methondOne() {
		System.out.println(methodTwo("dog", 2, 5));
		
		
		
	}

	public static int methodTwo(String word, int num1, int num2) {

		if (word.equals("hello")) {
			System.out.println("Hello");
			return 0;
		} else if (word!="hello" && num1>3) {
			return num1+num2;
		}
		else {
			System.out.println("bye");
			return num1*num2;
		}
	}
}