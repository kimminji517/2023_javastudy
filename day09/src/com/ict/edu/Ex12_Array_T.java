package com.ict.edu;

import java.util.Scanner;

public class Ex12_Array_T {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 학생수 받기
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		
		double[][] arr = new double[su][8];
		for (int i = 0; i < arr.length; i++) { // arr.length = su
			// ** for문이 실행 될 때마다 한사람의 정보를 담을수 있는 배열이 필요함
			double[] p = new double[8]; // for문 밖으로 빠지면 안됨. 
										// 빼서 만들때는 값이 한개일때
			// 키보드로 번호, 국어, 영어, 수학
				System.out.print("번호 : ");
				p[0] = scan.nextInt();
				
				System.out.print("국어점수 : ");
				p[1] = scan.nextInt();
				
				System.out.print("영어점수 : ");
				p[2] = scan.nextInt();
				
				System.out.print("수학점수 : ");
				p[3] = scan.nextInt();
				
				// 총점, 평균, 학점, 순위(초기값 지정)		
				p[4] = p[1] + p[2] + p[3];
				p[5] = (int)(p[4] / 3.0 * 10 / 10.0);
				
				if(p[5] >= 90) {
					p[6] = 'A';
				}else if(p[5] >= 80) {
					p[6] = 'B';
				}else if(p[5] >= 70) {
					p[6] = 'C';
				}else {
					p[6] = 'F';
				}
				
				p[7] = 1;
				
				// ** 다차원배열에 넣자
				arr[i] = p;
			}
	
			// 순위
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					// if(i == j) continue; 생략가능
					if(arr[i][4] < arr[j][4]) {
						arr[i][7]++;
					}
				}
			}
			
			// 순위로 오름차순 정렬
			// 자리를 변경하기 위해 임시배열 생성
			double[] tmp = new double[8];
			for (int i = 0; i < arr.length - 1 ; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i][7] > arr[j][7]) { //오름차순
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			
			// 출력 (국어, 영어, 수학은 제외)
			System.out.print("번 호\t총 점\t평 균\t학 점\t순위");
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					// 국어, 영어, 수학은 출력에서 제외
					if(j == 1 || j == 2 || j == 3 ) continue;
					if(j == 5) {
						System.out.print(arr[i][j] + "\t");
					}else if(j == 6) {
						System.out.print((char)(arr[i][j]) + "\t");
					}else {
						System.out.print((int)(arr[i][j]) + "\t");
					}
				}
				System.out.println();
			}
	}

}
