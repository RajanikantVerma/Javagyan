package com.javagyan.algorithm;

import java.util.Arrays;

public class BubbleSort {
	
	/*
	 * In bubblesort, we first compare consucative elements i.e, first we will
	 * comapare with 0th elememth to 1st , 1st to 2nd and so on will switch the
	 * places if current number is greater than next element.
	 */

	public static void main(String[] args) {
		int[] arr = {110,15,18,30,2,76,32,30};
		for(int i = 0; i < arr.length-1 ; i++) {
			for(int j = 0 ; j < arr.length-1-i ; j++ ) {
				if(arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int i : arr) {
		  System.out.println(i);	
		}
	}

}
