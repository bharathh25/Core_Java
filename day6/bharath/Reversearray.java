package com.day6.bharath;

import java.util.Arrays;

public class Reversearray {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		
		int[] revArr = new int[num.length];
		
		int nl = num.length-1;
		for(int i=0;i<num.length;i++) {
			revArr[i]=num[nl];
			nl--;
		}
		
//		for(int a : num) {
//			System.out.println(a);
//		}
//		
//		for(int b : revArr) {
//			System.out.println(b);
//		}
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(revArr));
	}
}
