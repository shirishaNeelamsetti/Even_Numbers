package com.demo;

import java.util.Arrays;

public class Class2 {

	public static void main(String[] args) {
		Object[] myvalues = new Object[3];
		myvalues[0] = 100;
		myvalues[1] = "shirisha";
		myvalues[2] = "shirisha@123";
		System.out.println(Arrays.toString(myvalues));

		for (Object x : myvalues) {
			System.out.println(x);
		}
	}

}
