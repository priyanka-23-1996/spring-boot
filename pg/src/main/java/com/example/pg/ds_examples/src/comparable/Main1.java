package com.example.pg.ds_examples.src.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// A class 'Movie' that implements Comparable
class Movie2 implements Comparable<Movie2>
{
	private double rating;
	private String name;
	private int year;

	// Constructor
	public Movie2(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }

	@Override
	public int compareTo(Movie2 o) {
		//System.out.println("o.year =  "+ o.year + ",this.year = " + this.year + ", return value =  " + (this.year - o.year));
		return this.year - o.year;
	}
}

// Driver class
class Main1
{
	public static void main(String[] args)
	{
		ArrayList<Movie2> list = new ArrayList<Movie2>();
		list.add(new Movie2("Force Awakens", 8.3, 2015));
		list.add(new Movie2("Star Wars", 8.7, 1977));
		list.add(new Movie2("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie2("Return of the Jedi", 8.4, 1983));
		

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie2 movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
		// no need to use comparable or comparator for primitive types.becoz here the sorting can be done becoz we have only one field to compare.
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(4);
		intList.add(5);
		intList.add(2);

		Collections.sort(intList);
		
		System.out.println("Integers after sorting : ");
		for (Integer int1: intList)
		{
			System.out.println(int1);
		}
	}
}
