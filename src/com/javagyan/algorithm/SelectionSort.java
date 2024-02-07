package com.javagyan.algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {110,15,18,30,2,76,32,30};
		for(int i = 0; i < arr.length-1 ; i++) {
			int minIndex = i;
			for(int j = i+1 ; j < arr.length ; j++ ) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]= temp;
		}
		for(int i : arr) {
		  System.out.println(i);	
		}

	}

}
