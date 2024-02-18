package com.javagyan.designpattern;

import java.util.HashMap;
import java.util.Scanner;

public class factroialDP {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
		sc.close();
	}

	private static int fact(int n) {
		return fact(n, new HashMap<Integer,Integer>());
	}

	private static int fact(int n, HashMap<Integer,Integer> map) {
		if(n==0 || n==1) 
			return 1;
		if(map.containsKey(n))
			return map.get(n);
		int fact = n*fact(n-1, map);
		map.put(n, fact);
		return fact;
	}

}
