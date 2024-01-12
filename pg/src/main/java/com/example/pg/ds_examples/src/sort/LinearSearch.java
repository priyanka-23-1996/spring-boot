package com.example.pg.ds_examples.src.sort;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int result = search(arr);

		if (result != -1)
			System.out.println("element is present at " + result);
		else
			System.out.println("element is not present");

	}

	private static int search(int[] arr) {
		int ele = 6;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele)
				return i;
		}
		return -1;
	}
}