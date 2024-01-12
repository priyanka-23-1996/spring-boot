package com.example.pg.ds_examples.src.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayOperations {

	public static void main(String[] args) {
	
		int[] arr= {1,3,5,5,6,6};
		// remove duplicates
		//count duplicates display chars and their count
		// max and min 
	   countDuplicates(arr);
	   removeDuplicates(arr);
	   removeDuplicatesByUsingSet(arr);
	   minMaxOfArray(arr);
		

	}

	private static void countDuplicates(int[] arr) {
		HashMap<Integer,Integer> m = new HashMap<>();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(m.containsKey(arr[i])){
				count = m.get(arr[i]);
				m.put(arr[i], count+1);
			}
			else
				m.put(arr[i], 1);
		}
		for(Map.Entry<Integer,Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + " count is = " + entry.getValue());
		}
	
		
	}

	private static void minMaxOfArray(int[] arr) {
		int min=arr[0],max=arr[0];
		for(int i=1 ;i<arr.length;i++) {
			if(min > arr[i])
				min= arr[i];
			if(max < arr[i])
				max= arr[i];
		}
		System.out.println("Max is = " +max + " Min is = " + min);
		
		
	}

	private static void removeDuplicatesByUsingSet(int[] arr) {
		int n= arr.length;
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++) {
			hs.add(arr[i]);
		}
		int index=0;
		for(Integer ele : hs) {
			arr[index++]= ele;
		}
		for(int i=0;i<hs.size();i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void removeDuplicates(int[] arr) {
		int n= arr.length;
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[j]= arr[i];
				j++;
			}
		}
		arr[j++]= arr[n-1];
		for(int k=0;k<j;k++) {
		System.out.println(arr[k]);
		}
		
	}

}
