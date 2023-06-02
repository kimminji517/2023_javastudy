package com.ict.edu2;

public class Printf {
	public static void main(String[] args) {
		System.out.printf("%d\n", 100);
		System.out.printf("%d\n", 1);
		System.out.printf("%d\n", 10000);
		System.out.println("===============================");

		System.out.printf("%5d\n", 100);
		System.out.printf("%5d\n", 1);
		System.out.printf("%-5d\n", 1);
		System.out.printf("%05d\n", 1);
		System.out.printf("%5d\n", 10000);
		System.out.println("===============================");

		System.out.printf("%s\n", "asd");
		System.out.printf("%-5s\n", "a");
		System.out.printf("%s\n", "asdfg");

		System.out.printf("%5s\n", "asd");
		System.out.printf("%5s\n", "a");
		System.out.printf("%-5s\n", "a");
		System.out.printf("%-05s\n", "a");  // 예외 => "0"은 문자열에서 사용할 수 없다.
		System.out.printf("%5s\n", "asdfg");
		System.out.println("===============================");

		System.out.printf("%f\n", 100);  // 예외발생 
		//=> 출력 서식 문자와 출력할 데이터 타입이 다를때
		System.out.printf("%f\n", 100.);
		System.out.printf("%6.2f\n", 12.34);
		System.out.printf("%6.2f\n", 12.3);
		System.out.printf("%6.2f\n", 12.345); // 소수점 3번째 자리는 반올림 됨
		System.out.printf("%6.0f\n", 12.345);
		System.out.println("===============================");

		System.out.println('A' + 32);
		System.out.printf("%d\n", 'A' + 32);
		System.out.println((char)('A' + 32));
		System.out.printf("%c\n", 'A' + 32);
		System.out.println("===============================");

		System.out.printf("%d + %d = %d\n", 5, 3, 5+3);
		System.out.printf("%d - %d = %d\n", 5, 3, 5-3);
		System.out.printf("%d * %d = %d\n", 5, 3, 5*3);
		System.out.printf("%d / %d = %d\n", 5, 3, 5/3);
		System.out.printf("%d / %d = %f\n", 5, 3, 5/3.);
		//출력서식에 "%"(나머지)자체를 출력하려면 "%%"와 같이 입력해야한다.
		System.out.printf("%d %% %d = %d\n", 5, 3, 5/3);
		System.out.println("===============================");

		//출력 서식의 개수보다 출력할 데이터가 많으면 남는 데이터는 무시된다.
		System.out.printf("%d + %d\n", 5, 3, 5 + 3);
		//출력 서식의 개수보다 출력할 데이터가 적으면 예외가 발생된다.
		System.out.printf("%d + %d\n = %d\n", 5, 3);// => 예외 발생
		

	}
}
