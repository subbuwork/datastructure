package com.java.ds;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Random random = new Random();
		for(c=1;c <= 10;c++){
			System.out.println(random.nextInt(100));
		}

	}

}
