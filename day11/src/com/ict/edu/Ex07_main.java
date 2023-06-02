package com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력하자
		
		Ex07_method test = new Ex07_method();
		
		// 입력받기
		for (int i = 0; i < hak.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			System.out.print("국어 점수 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 점수 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 점수 : ");
			math[i] = scan.nextInt();		

			// 총점 구하기
			test.getSum(kor[i], eng[i], math[i]);
			sum[i] = test.sum;
			// 평균 구하기
			avg[i] = test.avg;
			
			// 학점 구하기
			hak[i] = test.hak;
		}
		// 출력하기
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
		}
		System.out.println();
	}
}
