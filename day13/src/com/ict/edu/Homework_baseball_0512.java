package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Homework_baseball_0512 {
	 public static void main(String[] args) {
		 Random random = new Random();
	        Scanner scanner = new Scanner(System.in);

	        int[] playerGuess = new int[3]; // 플레이어가 입력한 숫자
	        int[] com = new int[3]; // 컴퓨터가 지정한 숫자
	        int attempts = 0; // 시도횟수

	        // 컴퓨터 랜덤숫자 생성
	        for (int i = 0; i < com.length; i++) {
	        	com[i] = random.nextInt(10);
	        	System.out.println(com[i]); //생성된 랜덤숫자 보기위해 임시 기재
	        }

	        System.out.println("야구게임을 시작합니다.");

	        while (true) {
	            attempts++;
	            System.out.print("0~9 사이의 세자리 숫자를 입력하세요 : ");
	            String guessStr = scanner.nextLine();

	            // 문자열을 정수열 배열로 저장
	            for (int i = 0; i < playerGuess.length; i++) {
	                playerGuess[i] = Character.getNumericValue(guessStr.charAt(i));
	            }

	            // 코드비교
	            int strike = 0; // 숫자 일치, 위치 일치
	            int ball = 0; // 숫자 일치, 위치 불일치

	            for (int i = 0; i < com.length; i++) {
	                if (playerGuess[i] == com[i]) {
	                	strike++;
	                } else {
	                    for (int j = 0; j < com.length; j++) {
	                        if (playerGuess[i] == com[j]) {
	                        	ball++;
	                            break;
	                        }
	                    }
	                }
	            }

	            System.out.println("스트라이크 : " + strike + ", 볼 : " + ball);
	            
	            if (strike == 3) {
	                System.out.println("홈런입니다. " + attempts + "회째에 맞추셨습니다.");
	                break;
	            }
	        }
	        scanner.close();	         
		}
	}
	      
	 
	 
