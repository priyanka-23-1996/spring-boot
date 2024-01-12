package com.example.pg.ds_examples.src.arrays;

public class MaxMin {

	public static void main(String[] args) {
	
		int arr[] = {1,4,2,3,8,9};
		int max=0;
		int min=0;
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]> arr[max])
	    		max=i;
	    	if(arr[i] < arr[min])
	    		min=i;
	    	
	    }
	    System.out.println("min element is " + arr[min] + " max ele is " + arr[max]);

	}

}
