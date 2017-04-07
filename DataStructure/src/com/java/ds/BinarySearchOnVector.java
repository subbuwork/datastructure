package com.java.ds;

import java.util.Collections;
import java.util.Vector;

public class BinarySearchOnVector {

	public static void main(String[] args) {
    Vector<String> vector = new Vector<String>();
		vector.add("X");
		vector.add("M");
		vector.add("D");
		vector.add("A");
		vector.add("O");
		System.out.println("Vector before sorting::"+vector);
		Collections.sort(vector);
		System.out.println("Vector after sorting:::"+vector);
		Integer index = Collections.binarySearch(vector,"D");
		System.out.println("Element found at:::"+index);
		
	}

}
