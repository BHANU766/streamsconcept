package com.streamsconcept;

import java.util.Arrays;
import java.util.List;

public class Stream1 {

	public static void main(String[] args) {
		//create a list of integer
		List<Integer> numbers=Arrays.asList(10,15,18,13,25);
		System.out.println(numbers); 
		
		//streams of the data (creation of streams)
		System.out.println(numbers.stream());  
		
		numbers.stream()
		.filter(num->num%2==0)           //intermediate operation
		.forEach(System.out::println);   //terminal operation
		
		numbers.stream()
		.map(num->num+1)                 //intermediate operation
		.forEach(System.out::println);   //terminal operation
		
         //add all the numbers and print it
		int sum=numbers.stream().reduce(0,Integer::sum);
		System.out.println("sum of the numbers " +sum);
	}

}
