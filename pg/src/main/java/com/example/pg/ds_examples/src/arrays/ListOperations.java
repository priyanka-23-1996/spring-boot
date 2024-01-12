package com.example.pg.ds_examples.src.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		String s="abcd";
		System.out.println(s.replaceAll(s.substring(1,3),""));
		
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		List<Integer> l1 = l.subList(3, 6);
		System.out.println(l);
		System.out.println(l1);
		l.removeAll(l1);
		System.out.println(l);
		
	}

}