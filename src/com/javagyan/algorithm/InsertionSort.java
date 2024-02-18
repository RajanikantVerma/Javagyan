package com.javagyan.algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {110,15,18,30,2,76,32,30};
		for(int i = 0; i < arr.length ; i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>current) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		for(int i : arr) {
		  System.out.println(i);
		}

	}

}
