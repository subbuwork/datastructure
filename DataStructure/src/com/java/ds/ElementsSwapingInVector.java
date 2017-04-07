package com.java.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ElementsSwapingInVector {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");
		System.out.println(vector);
		Collections.swap(vector,0,4);
		System.out.println("After swaping::"+vector);
		
		List<Integer> nList = new ArrayList<Integer>();
		nList.add(1);
		nList.add(2);
		nList.add(3);
		nList.add(4);
		nList.add(5);
		System.out.println("Befor swap list:"+nList);
		Collections.swap(nList, 0, 4);
		System.out.println("After swap::"+nList);
		
	}

}
