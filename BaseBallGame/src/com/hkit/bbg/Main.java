package com.hkit.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;           
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		//랜덤값 3개 추출(중복x)
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
		//콘솔에서 값을 입력받기 위한 객체
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("값을입력해주세요 :");
		int value1 = scan.nextInt();
		
		
		System.out.print("값을입력해주세요 :");
		int value2 = scan.nextInt();
		
		
		System.out.print("값을입력해주세요 :");
		int value3 = scan.nextInt();
		System.out.printf("value1 : %d\nvalue2 : %d\nvalue3 : %d\n", value1, value2, value3);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<NO_COUNT; i++) {
			System.out.print("값을입력해주세요 :");
			int value = scan.nextInt();
			userNoArray[i] = value;
		}
		scan.close();
		
		for(int item : userNoArray) {
			System.out.println("valu : " + item);
		}
	
	}

}
