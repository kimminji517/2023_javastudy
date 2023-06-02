package com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {

	public static void main(String[] args) {
		// 스캐너로 입력받고, 학급인원도 정해서 순위 매기기
		Scanner scan = new Scanner(System.in);
		// 정보를 배열에 넣기위해 인원수를 물어보기
		System.out.print("학생 수 : ");
		int stu = scan.nextInt();
		
		//미리 배열 만들기
		String[] name = new String[stu];
		int[] kor = new int[stu];
		int[] eng = new int[stu];
		int[] math = new int[stu];			
		int[] sum = new int[stu];
		double[] avg = new double[stu];
		String[] hak = new String[stu];
		int[] rank = new int [stu];
		
		for (int j = 0; j < stu; j++) {
			System.out.print("이름 : ");
			name[j] = scan.next();
			
			System.out.print("국어 점수 : ");
			kor[j] = scan.nextInt();

			System.out.print("영어 점수 : ");
			eng[j] = scan.nextInt();

			System.out.print("수학 점수 : ");
			math[j] = scan.nextInt();
			
			sum[j] = kor[j] + eng[j] + math[j];
			avg[j] = (int)(sum[j] / 3.0 * 10) / 10.0;
			if(avg[j] >= 90) hak[j] = "A 학점";
			else if(avg[j] >= 80) hak[j] = "B 학점";
			else if(avg[j] >= 70) hak[j] = "C 학점";	
			else hak[j] = "F 학점";
			
			rank[j] = 1;
		}
		// 순위
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum.length; j++) {
				if(i == j) continue;
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < stu; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}
	}
}
