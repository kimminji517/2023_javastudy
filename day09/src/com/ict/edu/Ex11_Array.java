package com.ict.edu;

import java.util.Arrays;

public class Ex11_Array {

	public static void main(String[] args) {
		int[][] arr = new int [5][5];
		
		       // 번호, 총점, 평균, 학점, 순위
		int[] p1 = {1, 270, 90, 'A', 1};
		int[] p2 = {2, 210, 70, 'C', 1};
		int[] p3 = {3, 180, 60, 'F', 1};
		int[] p4 = {4, 300, 100, 'A', 1};
		int[] p5 = {5, 280, 95, 'A', 1};
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		int[][] arr2 = new int[5][5];
		// 순위구하기	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}//System.out.print(arr[i][j] + " ");
			}
			//System.out.println();
			
		}
		// 순위로 오름차순 정렬	
		for (int i = 0; i < arr2.length; i++) {
				if(arr[i][4] == 1) {
					arr2[0] = arr[i];
				}else if(arr[i][4] == 2) {
					arr2[1] = arr[i];
				}else if(arr[i][4] == 3) {
					arr2[2] = arr[i];
				}else if(arr[i][4] == 4) {
					arr2[3] = arr[i];
				}else {
					arr2[4] = arr[i];
				}
		}
		// 정렬 기준으로 출력
		for(int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
	
		/* 예상결과
		 * 4, 300, 100, 'A', 1
		 * 5, 280, 95, 'A', 1
		 * 1, 270, 90, 'A', 1
		 * 2, 210, 70, 'C', 1
		 * 3, 180, 60, 'F', 1
		 */
	


