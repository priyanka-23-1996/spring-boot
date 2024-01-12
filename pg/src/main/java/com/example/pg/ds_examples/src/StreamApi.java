package com.example.pg.ds_examples.src;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamApi {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		l.add(2);
		l.add(3);
		// convert it into stream
		Stream<Integer> s=l.stream();
		
		int arr[] = {1,2,3};
		IntStream s1= Arrays.stream(arr);
		
		String[] str= {"hi","hello","bye"};
		Stream<String> s3 = Arrays.stream(str);
		Object[] a= s3.filter(ele -> ele.length() > 2).toArray();
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	//	Stream<String> s2=	s1.map(ele -> ele.toString());
		
		
		// stream function it will iterate elements one by one 
		//filter is used to make condition
		//sorted
		l.stream().filter(n -> n > 5).sorted().forEach(System.out::println);
		String[] myArray = { "this", "is", "a", "sentence","in" };
		String result = Arrays.stream(myArray)
		                .reduce("", (a1,b) -> a1 + b);
		System.out.println(result);
		
		Stream<Integer> st;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
// map method
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		 
		List<Integer> listOfIntegers = listOfStrings.stream()
		        .map(Integer::valueOf)
		        .collect(Collectors.toList());
		 
		System.out.println(listOfIntegers);
		List<Integer> listOfIntegers1 = listOfStrings.stream()
		        .map(p -> Integer.valueOf(p))
		        .collect(Collectors.toList());
		 
		System.out.println(listOfIntegers1);
		
// filter method
		List<Integer> listOfInt = Arrays.asList(1, 2, 3, 4, 5,2);
		listOfInt.stream().filter(p -> (p%2 == 0)).sorted().forEach(p -> System.out.println(p));
	}

}
