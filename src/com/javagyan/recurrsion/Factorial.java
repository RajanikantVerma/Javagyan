package com.javagyan.recurrsion;

public class Factorial {

	public static int fact(int m) {
		if(m==0) return 1;
		return m*fact(m-1);
	}

	public static void main(String[] args) {
	   System.out.println(fact(5));
	}

}
