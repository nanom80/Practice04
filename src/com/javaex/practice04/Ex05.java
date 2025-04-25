package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[5];
		
		int sum = 0;
		
		for(int i=0; i< data.length; i++) {
			data[i] = sc.nextInt();
			sum += data[i];
		}
		
		double avg = sum / data.length;
		
		System.out.println("평균은 "+avg+" 입니다");
		
		sc.close();
	}
}
