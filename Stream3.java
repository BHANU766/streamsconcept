package com.streamsconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		//john, joe, lavish, jenny, magesh
		//find out the names whose names start with j letter
		
		//create list of names
		List<String> names=Arrays.asList("john", "joe", "lavish", "jenny", "magesh");
		
		List<String> result=
		names.stream()
        .filter(n->n.startsWith("j"))
        .map(String::toUpperCase)
        .collect(Collectors.toList());
		
		System.out.println(result);
		
	}

}
