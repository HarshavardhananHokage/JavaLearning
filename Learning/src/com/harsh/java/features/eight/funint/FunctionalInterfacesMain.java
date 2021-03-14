package com.harsh.java.features.eight.funint;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfacesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		
		intList.forEach(item -> System.out.println(item * item));
	}

}
