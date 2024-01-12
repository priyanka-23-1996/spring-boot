package com.example.pg.ds_examples.src.sort;

public class dummy1 {

	public static void main(String[] args) {
		// reverse without inbuild function

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int size = arr.length;
		int temp = 0;
		for (int i = 0, j = size - 1; i < size / 2 && j >= size / 2; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}

}
