package com.harsh.java.features.eight;

import java.util.List;
import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();

		MethodReferences mr = List::add;
		
		mr.accept(list, "addbaby");
		mr.accept(list, "subbaby");
		
		System.out.println(list.toString());
	}
}
