package com.example.pg.ds_examples.src.arrays;

import java.util.Stack;

public class ReverseStr {

	public static void main(String[] args) {

		String input = "abc123@";
		reverseString1(input);
		reverseString2(input);
		reverseString3(input);
		reverseString4(input);
		String str = 1 +"str";
		System.out.println(str);
		
	}

	private static void reverseString4(String input) {
		Stack<Character> st = new Stack();
		char[] ch = input.toCharArray();
		String output="";
		for(char c :ch) {
			st.push(c);
		}
		while(!st.isEmpty()) {
			output += st.pop();
		}
		System.out.println(output);
	}

	private static void reverseString3(String input) {
	 StringBuffer sb= new StringBuffer(input);
	 System.out.println(sb.reverse());
		
	}

	private static void reverseString2(String input) {
		
		String result= "";
		char[] output= input.toCharArray();
		int n= output.length;
		for(int i=0,j=n-1;i<n/2 && j>=n/2 ; i++,j--) {
			char ch= output[i];
			output[i]=output[j];
			output[j]=ch;
		}
		for(int i=0;i<n ; i++) {
			result += output[i];
		
		}
		System.out.println(result);
	}

	private static void reverseString1(String input) {
		int n= input.length();
		String output="";
		for(int i=n-1;i>=0 ;i--) {
			output += input.charAt(i);
			
		}
		System.out.println(output);
		
	}

}
