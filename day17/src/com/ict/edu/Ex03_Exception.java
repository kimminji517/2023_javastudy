package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

/* finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을 처리할때 사용
			주로 데이터베이스, 입/출력, 네트워크에서 사용
	형식) try{
		예외 발생 가능한 문장들;
		예외 발생 되면 아래문장 무시하고 catch로 이동한다.
		예외 발생 가능한 문장들;
		예외 발생 가능한 문장들;
     }catch(발생한 예외객체 e){
		예외 발생시 처리하는 문장;
     }catch(발생한 예외객체 e){
		예외 발생시 처리하는 문장;
     }finally{
     	반드시 실행해야 되는 문장;
   	 }
   */
public class Ex03_Exception {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			try {
				int su1 = 50;
				System.out.print("정수 입력 : ");
				int su2 = scan.nextInt();
				System.out.println("정답 : " + (su1 / su2));

			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				//return;
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다.");
				//return; // 원래는 기재된 return때문에 JVM으로가서 "수고하셨습니다"가 실행 되지 않지만
			} finally { // finally 문장은 반드시 수행됨
				System.out.println("반드시 수행되는 문장");
				scan.close();
			}
			System.out.println("수고하셨습니다.");
		}
	}

}
