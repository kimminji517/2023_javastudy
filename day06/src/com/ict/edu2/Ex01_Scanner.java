
package com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 표준 출력장치 (모니터)
		// System.in => 표준 입력장치 (키보드)
		// 해당 클래스를 사용하기 위해 import를 해야 된다.

		// java.lang 패키지안에 존재하는 클래스는 아무런 제약없이 사용 가능(import 안함)
		// java.lang 패키지 외에 존재하는 클래스는 무조건 import 해야 한다.

		// import 방법 1. 클래스 이름 뒤에서 ctrl + space
		//            2. ctrl + shift + O (웹에서는 사용불가)

		// 해당 클래스 커서를 뒤에 놓고 shift + F2 => 해당 클래스 API 설명서가 나타난다.
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");
		// .next(); : 입력한 내용은 String으로 처리하는 메소드, 띄어쓰기나 엔터치면 끝나니 주의!!
		String name = scan.next();
		System.out.println("받은 내용 : " + name);

		System.out.print("나이 : "); // String을 처리하는 메소드로 결과가 문자로 연결됨
		String age = scan.next();
		System.out.println("받은 내용 : " + (age + 1));

		System.out.print("나이 : ");
		// .nextInt() : 입력한 내용을 int로 처리하는 메소드
		int age2 = scan.nextInt();
		System.out.println("받은 내용 : " + (age2 + 1));

		System.out.println("키 : ");
		// .nextDouble() : 입력한 내용을 double 으로 처리하는 메소드
		double ke = scan.nextDouble();
		System.out.println("받은 내용 : " + ke);

		System.out.println("당신은 남성입니까?(true/false)");
		// .nextBoolean() : 입력한 내용을 boolean 으로 처리하는 메소드 (숫자 및 다른문자를 입력하면 오류)
		boolean gender = scan.nextBoolean();
		System.out.println("받은 내용 : " + gender);
		if (gender) {
			System.out.println("당신은 남성입니다.");
		} else {
			System.out.println("당신은 여성입니다.");
		}

		// nextChar()는 존재하지 않는다. 그러므로 char는 사용 못함.
	}
}
