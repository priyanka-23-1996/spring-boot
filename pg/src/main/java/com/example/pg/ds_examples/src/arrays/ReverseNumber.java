package com.example.pg.ds_examples.src.arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=345;
		int rem=0;
		int reverse=0;
		while(number != 0) {
			    rem = number % 10;
			    reverse = reverse * 10 + rem;
			    number /= 10;
			
			
		}
		System.out.println(reverse);

	}

}
