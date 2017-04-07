package com.java.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(10);
		
		System.out.println("Max:::"+Collections.max(list));
		System.out.println("Min::"+Collections.min(list));

	}

}
