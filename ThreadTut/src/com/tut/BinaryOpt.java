package com.tut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOpt {

	static List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	static List<Integer> listInt2 = new ArrayList<>();
	static BinaryOperator<Integer> binaryOperator = (i, j) -> i * j;

	public static void main(String... a){
		listInt.forEach(i->listInt2.add(binaryOperator.apply(i, i+2)));
		
		listInt2.forEach(j->System.out.println("Output is : "+j));
	}
	
}
