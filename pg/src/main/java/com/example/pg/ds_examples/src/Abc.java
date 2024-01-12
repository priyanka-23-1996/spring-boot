package com.example.pg.ds_examples.src;

import java.util.List;
import java.util.stream.Stream;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = List.of("5", "2", "a");
		int sum = 0;
		for (String s : l) {

			try {
				if (Integer.valueOf(s) != null) {
					int n = Integer.valueOf(s);
					sum += n;
				}
			} catch (NumberFormatException e) {
				System.out.println(e);
			}

		}
		System.out.println("sum=" + sum);

	}
}
