package com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Test0512 {
	public static void main(String[] args) {
		// 구구단중 7단 출력하는 코딩
			int i = 1;
//			while (i < 10) {
//				int j = 7;
//				System.out.println(j + "*" + i + " = " + (i * j));
//				i++;
//			}
//			System.out.println("=================");
//
//			
//			
//		// 다중 for문을 활용하여 결과가 나오게 코딩을 작성하시오.
//			for (i = 0; i < 4; i++) {
//				for (int j = 0; j < 4; j++) {
//					if(i == j) {
//						System.out.print("1 ");
//					}else {
//						System.out.print("0 ");
//					}	
//				}
//				System.out.println();
//			}
//			
//		// Scanner를 이용해서 숫자를 받아 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하는 코딩
//		Scanner scan = new Scanner(System.in);
//		int count = 0;
//		int even = 0;
//		esc:
//			while(true) {
//				count++;
//				System.out.print("숫자입력 : ");
//				int su = scan.nextInt();
//				String str = "";
//				if(su % 2 == 0) {
//					str = "짝수";
//					even++;
//				}else {
//					str = "홀수";
//				}
//				System.out.println(su + "는 " + str + " 입니다.");
//				while(true) {
//					System.out.print("계속할까요?(Y(y)/N(n)) >> ");
//					String s1 = scan.next();
//					if(s1.equalsIgnoreCase("y")){
//						continue esc;
//					}else if(s1.equalsIgnoreCase("n")) {
//						break esc;
//					}else {
//						System.out.println("제대로 입력하세요");
//						continue;
//					}
//				}
//			}
//			double per = (even / (count * 1.0)) * 100;
//			System.out.println("전체 개수 : " + count);
//			System.out.println("짝수 개수 : " + even);
//			System.out.println("퍼센트 : " + (int) (per * 10) / 10.0 + "%");
//		

//// 아래 배열을 오름차순으로 정렬하는 코딩을 작성
//int[] su = {3, 4, 9, 8, 2, 1, 7, 10, 5, 6};
//
//int tmp = 0;
//
//for (int i = 0; i < su.length - 1; i++) {
//	for (int j = i + 1; j < su.length; j++) {
//		if(su[i] > su[j]) {
//			tmp = su[i];
//			su[i] = su[j];
//			su[j] = tmp;
//		}
//	}
//}
//for (int i = 0; i < su.length; i++) {
//	System.out.print(su[i] + " ");	
//}
//
//// 배열들을 보고 순위를 구하는 코딩을 작성 (정렬 및 출력 하지 않아도됨)
//int[] su = {90, 80, 70, 95, 90, 85, 75};
//int[] rank = {1, 1, 1, 1, 1, 1, 1};
//
//for (int i = 0; i < su.length; i++) {
//	for (int j = 0; j < su.length; j++) {
//		if(su[i] < su[j]) {
//			rank[i]++;
//		}
//	}
//}
//for (int i = 0; i < rank.length; i++) {
//	System.out.print(rank[i] + " ");
//}
//
//// 배열을 보고 가장 작은 값과 가장 큰 값을 구하는 코딩을 작성
//int[] su = {90, 87, -20, 120, 67, 23, 40, 53};
//int tmp = 0;
//for (int i = 0; i < su.length -1 ; i++) {
//	for (int j = i + 1; j < su.length; j++) {
//		if(su[i] > su[j]) {
//			tmp = su[i];
//			su[i] = su[j];
//			su[j] = tmp;
//		}
//	}	
//}
//System.out.println("가장 작은 값 : " + su[0]);
//System.out.println("가장 큰 값 : " + su[7]);
//
//// 가변길이 다차원 배열을 보고 출력하는 코딩을 작성
//int[][] su = new int[3][];
//int[] k1 = {10, 20, 30};
//int[] k2 = {100, 200};
//int[] k3 = {1000, 2000, 3000, 4000};
//su[0] = k1;
//su[1] = k2;
//su[2] = k3;
//
//for (int i = 0; i < su.length; i++) {
//	for (int j = 0; j < su[i].length; j++) {
//		System.out.print(su[i][j]+ " ");
//	}
//	System.out.println();
//}
//
// 번호, 총점, 평균, 학점, 순위를 다차원 배열에 넣고 순위와 순위 기준으로 오름차순 정렬하고
// 출력하는코딩

			int[][] arr = new int[5][5];
// 번호, 총점, 평균, 학점, 순위
			int[] p1 = { 1, 270, 90, 'A', 1 };
			int[] p2 = { 2, 210, 70, 'C', 1 };
			int[] p3 = { 3, 180, 60, 'F', 1 };
			int[] p4 = { 4, 300, 100, 'A', 1 };
			int[] p5 = { 5, 285, 95, 'A', 1 };

// p1, p2, p3, p4, p5배열을 arr 배열에 넣기
			arr[0] = p1;
			arr[1] = p2;
			arr[2] = p3;
			arr[3] = p4;
			arr[4] = p5;
// 순위를 구하기
			for (i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i == j) continue;// 자기자신 제외
					if (arr[i][1] < arr[j][1]) {
						arr[i][4]++;
					}
				}
			}

// 자리 변경을 위한 임시 배열 필요
			int[] tmp = new int[5];
// 순위로 오름 정렬
			for (i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < p5.length; j++) {
					// 오름차순
					if (arr[i][4] > arr[j][4]) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}

// 출력
			for (i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j == 3) {
						System.out.print((char) (arr[i][j]) + "\t");
					} else {
						System.out.print(arr[i][j] + "\t");
					}
				}
				System.out.println();
			}
		}
	}
