package com.java.ds;

import java.util.LinkedList;

public class ElementSearchInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nList = new LinkedList<Integer>();
		nList.add(1);
		nList.add(2);
		nList.add(3);
		nList.add(4);
		nList.add(5);
		nList.add(2);
		
		System.out.println("First Index of 2 is:::"+nList.indexOf(2));
		System.out.println("Last Index of 2 is:::"+nList.lastIndexOf(2));
		

	}

}
