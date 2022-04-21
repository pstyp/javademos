package com.qa.demo;

public class StringManipulation {

	
	public static void main(String[] args) {
		//METHOD 1
		
//		String myStr = "I like strings";
//		String myStr3 = "I like strings";
//		
//		// METHOD 2
//		
//		String myStr2 = new String("I LIKE STRINGS");
//		
//		System.out.println(myStr==myStr2);
//		System.out.println(myStr.equalsIgnoreCase(myStr2));
//		
//		System.out.println("String length is " + myStr2.length());
//		
//		for (int i=0; i<myStr.length(); i++) {
//			System.out.println(myStr.charAt(i));
//		}
		
		String str1 = "ThISIsSoMeTeXt";
		String str2 = "thisissometext";
		
		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		
//		System.out.println(str1.charAt(0));
//		System.out.println(str1.indexOf("I"));
//		System.out.println(str1.startsWith("T"));
//		System.out.println(str1.endsWith("t"));
		System.out.println(str1.contains("o"));
//		System.out.println(str1.substring(1, 4));
//		System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));
//		System.out.println(str1.equals(str2));
	}
}
