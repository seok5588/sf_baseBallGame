package com.hkit.bbg;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;           
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		for(int i=0; i<NO_COUNT; i++) {
			int randomValue = (int)(Math.random() * 9) + 1;
			               //i+1
			for(int z=0; z<NO_COUNT; z++) {
				if(randomNoArray[z] == randomValue) {
					i--;
					break;
				}
				else if(randomNoArray[z] == 0) {
					randomNoArray[z] = randomValue;
					break;
				}
			}
		}
		
		for(int item : randomNoArray) {
			System.out.println(item);
		}
	
	}

}
