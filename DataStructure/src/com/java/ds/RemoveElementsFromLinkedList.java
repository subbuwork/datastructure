package com.java.ds;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {

	public static void main(String[] args) {

		LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4"); 
		lList.add("5");
		lList.add("6");
		
		System.out.println(lList);
		
		lList.subList(0, 4).clear();
		System.out.println(lList);
		System.out.println(lList.get(0));
	}
	

}
