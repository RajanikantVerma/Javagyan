package com.javagyan.recurrsion;

public class TowerOfHanoi {

	public void move(int numberOfDisc , char from , char to , char intern) {
		if(numberOfDisc == 1) {
			System.out.println("moving disc : " + 1 + " from : " + from + " to : "+  to);
		}
		else {
		move( numberOfDisc -1, from , intern, to);
		System.out.println("moving disc : " + numberOfDisc + " from : " + from + " to : "+  to);
		move( numberOfDisc -1, intern , to, from);
		}
	}

	public static void main(String[] args) {
		TowerOfHanoi h = new TowerOfHanoi();
		h.move( 4, 'A' , 'C', 'B');

	}

}
