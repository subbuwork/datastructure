package com.java.ds;

import java.util.LinkedList;

public class UpdateLinkedList {

	public static void main(String[] args) {

		LinkedList<String> lList = new LinkedList<String>();
		lList.add("B");
		lList.add("B");
		lList.add("M");
		lList.add("T");
		lList.add("L");
		System.out.println(lList);
		lList.set(2,"T");
		System.out.println(lList);
		System.out.println(lList.get(2));
	}

}
