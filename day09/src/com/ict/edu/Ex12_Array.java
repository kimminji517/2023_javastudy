package com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {

	public static void main(String[] args) {
		// 학생수 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		int[][] arr = new int[su][];
				
		// 키보드로 번호, 국어, 영어, 수학
		int[] num = new int[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];
		
		// 총점, 평균, 학점, 순위(초기값 지정)
		for (int i = 0; i < su; i++) {
			System.out.print("번호 : ");
			num[i] = scan.nextInt();
			
			System.out.print("국어점수 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어점수 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학점수 : ");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 * 10) / 10.0;
			if(avg[i] >= 90) hak[i] = "A 학점";
			else if(avg[i] >= 80) hak[i] = "B 학점";
			else if(avg[i] >= 70) hak[i] = "C 학점";	
			else hak[i] = "F 학점";
			
			rank[i] = 1;
		}
		
		
		// 순위
		for(int i = 0; i < su; i++) {
			for(int j = 0; j < su; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		// 순위로 오름차순 정렬
		for(int i = 0; i < su; i++) {
			for(int j = i + 1; j < su; j++) {
				if(rank[i] > rank[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
					temp = kor[i];
					kor[i] = kor[j];
					kor[j] = temp;
					
					temp = math[i];
					math[i] = math[j];
					math[j] = temp;
				}
			}
		}
		// 출력
		for(int i = 0; i < su; i++) {
			for (int j = 0; j < su; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}

