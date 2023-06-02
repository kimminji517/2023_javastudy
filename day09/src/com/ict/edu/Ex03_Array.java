package com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {
	public static void main(String[] args) {
		// 정렬하기
		int[] su = {3, 4, 9, 8, 2, 1, 7, 10, 5, 6};
		
		// 자리 변경을 위한 임시 위치(변수) 필요
		int tmp = 0;
		
		for (int i = 0;  i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				// 비교하기 오름(i > j), 내림(i < j) 때 자리 변경
				if(su[i] > su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		System.out.println("==============");
		
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.println();
		
		int[] su2 = {3, 4, 9, 8, 2, 1, 7, 10, 5, 6};
		System.out.println("==============");
		// Arrays 클래스는 배열 복사, 정렬, List로 전환 등
		// 배열에 관련된 기능을 제공하는 클래스
		// 오름차순 정렬은 sort()로 가능
		// 내림차순은 없음 (단점)
		
		Arrays.sort(su2);
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i] + " ");
			
		System.out.println();
		System.out.println("==============");
		
		// int[] su3 = {3, 4, 9, 8, 2, 1, 7, 10, 5, 6}; <= 이거로하면 오류남
		Integer[] su3 = {13, 14, 19, 18, 12, 11, 17, 20, 15, 16};
		Arrays.sort(su3, Collections.reverseOrder());
		for (i = 0; i < su3.length; i++) {
			System.out.print(su3[i] + " ");
		}
		System.out.println();
		System.out.println("==============");
	}
}
}
