package com.demo;

public class Class1 {

	public static void main(String[] args) {
     int a[]= {1,2,3,4,5,6};
     System.out.println("even numbers in array");
     for (int i=0;i<=a.length-1;i++) {
     if(a[i]%2==0) {
    	 System.out.println(a[i]);
     }
	}

}
}