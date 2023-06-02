package com.ict.edu;

import java.util.Scanner;

public class Ex03_main {

//	메뉴에  반환메뉴를 추가 해서 
//	입금 후 사지  않아도 될 수 있도록 한다.
	public static void main(String[] args) {
		Ex03_get_set coffee = new Ex03_get_set();
		coffee.setName("커피음료");
		coffee.setPrice(1000);

		Ex03_get_set ion = new Ex03_get_set();
		ion.setName("이온음료");
		ion.setPrice(1500);

		Ex03_get_set cola = new Ex03_get_set();
		cola.setName("탄산음료");
		cola.setPrice(1200);

		Ex03_get_set juice = new Ex03_get_set();
		juice.setName("과일음료");
		juice.setPrice(1800);

		/*
		 * Ex01_method[] arr = new Ex01_method[4]; arr[0] = coffee; arr[1] = ion; arr[2]
		 * = cola; arr[3] = juice;
		 */

		// 음료들의 최소금액을 구하기(오름차순에서 맨 처음것 최소값, 맨 끝에것 최대값)
		// 자판기 코드에서
		// 입금액과 판매액 중에
		// 입금액이 작으면 무조건 계산하지 않고
		// 입금액 출력해야 된다.
		
		int input = 0;
		Ex03_get_set[] arr = { coffee, ion, cola, juice }; // 위에 내용하고 같은 의미
			
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>> ");
		input = scan.nextInt();
		
		while (input >= 1000) {
			System.out.println("커피\t이온\t탄산\t과일");

			// 입력금액과 각 음료수의 가격을 비교
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) {
					System.out.print("O\t");
					// System.out.print(arr[i].name+"\t"); 살수있는 메뉴만 표시하는법
				} else {
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.print("선택하세요 >> ");
			String drink = scan.next();

			int output = 0;
			switch (drink) {
			case "커피": output = input - arr[0].getPrice();	break;
			case "이온": 	output = input - arr[1].getPrice();	break;
			case "탄산": 	output = input - arr[2].getPrice();	break;
			case "과일": 	output = input - arr[3].getPrice(); break;
			default: System.out.println("잘못 선택하셨습니다.");
				output = input;
				break;
			}
			// 잔돈이 판매액보다 크면 다시 구매할 수 있는 선택 화면이 나와 야 한다.
			// 잔돈이 판매액보다 작으면 잔돈 반환
			 if (output < input) {
		            System.out.println(drink + "을(를) 선택하셨습니다.");
		            System.out.println("잔돈 : " + output + "\n");
		            input = output;
		        } else {
		            System.out.println("잔돈이 부족합니다.");
		            System.out.println("잔돈 : " + input + "\n");
		        }
			}
			System.out.println("잔돈이 반환됩니다. 잔돈 : " + input);
		}

	}

