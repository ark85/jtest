package com.example;

import java.util.*;

public class example1 {
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < n; i++) {
			mas[i] = sc.nextInt();
		}
		
		int sw = 0;
		int c = 0;
		boolean b = true;
		while (b == true) {
			b = false;
			for(int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					int t = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = t;
					sw++;
					b = true;
				}
			}
			c++;
		}
		
		System.out.println(c + " " + sw);
		sc.close();
	}
}
