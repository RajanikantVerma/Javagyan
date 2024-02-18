package com.javagyan.samsung;

import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int noOfTest = sc.nextInt();
			for(int i =1; i<= noOfTest ; i++) {
				int noOfGoodsType = sc.nextInt();
				long minimumItem = sc.nextInt();
				long[] stock = new long[noOfGoodsType];
				long[] dailyIncoming = new long[noOfGoodsType];
				long sumOfInitialDayStock = 0;
				int maxNoOfStockIncoming = 0;
				for(int j =0; j< noOfGoodsType ; j++) {
					int initialEachStock = sc.nextInt();
					int dailyEachStock = sc.nextInt();
					if(maxNoOfStockIncoming < dailyEachStock) {
						maxNoOfStockIncoming= dailyEachStock;
					}
					//System.out.println("initialEachStock" + initialEachStock);
					sumOfInitialDayStock = sumOfInitialDayStock + initialEachStock;
					stock[j]= initialEachStock;
					dailyIncoming[j]= dailyEachStock;
					//System.out.println("sumOfInitialDayStock" + sumOfInitialDayStock);
				}
				System.out.println("minimumItem" + minimumItem + "maxNoOfStockIncoming" + maxNoOfStockIncoming);
				if(sumOfInitialDayStock < minimumItem) {
					System.out.println(i +" "+ 0);
				}else if(maxNoOfStockIncoming > minimumItem) {
					System.out.println(i +" "+ -1);
				}else {
					int count = 0;
					while(sumOfInitialDayStock>minimumItem) {
						long maxItem = 0;
						int index = 0;
						for(int j = 0; j<noOfGoodsType ; j++) {
							stock[j] = stock[j] + dailyIncoming[j];
							sumOfInitialDayStock = sumOfInitialDayStock + dailyIncoming[j];
							if(stock[j]>maxItem) {
								maxItem = stock[j];
								index = j;
							}
						}
						//System.out.println("sumOfInitialDayStock" + sumOfInitialDayStock);
						sumOfInitialDayStock = sumOfInitialDayStock - maxItem;
						stock[index] = 0;
						count++;
						if(count>100000) {
							System.out.println(i +" "+ -1);

						}
					}
					System.out.println(i +" count "+ count);
				}
			}
		}

	}

}
