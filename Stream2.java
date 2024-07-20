package com.streamsconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		//create a list of string
		List<String> list=Arrays.asList("pune" ,"bengaluru" ,"chennai", "hyderabad", "mumbai");

		//create stream of list
		Stream<String> s1=list.stream();
		System.out.println(s1);
		
		//process the output and print it
		s1.forEach(System.out::println);
		System.out.println(s1);
		
		//streams of objects
		Stream<String> names=Stream.of("pune" ,"bengaluru" ,"chennai", "hyderabad", "mumbai");
        names.forEach(System.out::println);
	}

}
