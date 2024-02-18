package com.javagyan.designpattern;

import java.util.Scanner;
import java.util.HashMap;

public class FiboonaciDP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibbonaci(n));
		sc.close();
		
	}

	private static int fibbonaci(int n) {
		return fibbonaci(n, new HashMap<Integer,Integer>());
	}

	private static int fibbonaci(int n, HashMap<Integer, Integer> map) {
		if(n<=1)
			return n;
		if(map.containsKey(n))
			return map.get(n);
		int fib = fibbonaci(n-1, map) + fibbonaci(n-2, map);
		map.put(n, fib);
		return fib;
	}
}