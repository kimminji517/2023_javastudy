package com.ict.edu2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Tv tv = new Tv();
		Speaker speaker = new Speaker();
		Earphone earphone = new Earphone();
		
		System.out.print("장치를 선택하세요 1.tv, 2.speaker, 3.earphone >> : ");
		int select = scan.nextInt();
		
		while (RemoteControl.volume <= 10) {
			switch (select) {
			case 1:
				System.out.print("volumeup(1) / volumedown(2) / 나가기(3) >> ");
				int user = scan.nextInt();
				if (user == 1) {
					tv.volume++;
					break;
				} else if (user == 2) {
					tv.volume--;
					break;
				} else if (user == 3) {
					break;
				}else{ 
					System.out.println("1, 2 중 선택하세요");
					continue;
				}

			case 2:
				System.out.print("volumeup(1) / volumedown(2) / 나가기(3) >> ");
				user = scan.nextInt();
				if (user == 1) {
					speaker.volume++; System.out.println(speaker.volume);
					break;
				} else if (user == 2) {
					speaker.volume--;
					break;
				} else {
					System.out.println("1, 2 중 선택하세요");
					continue;
				}
			case 3:
				earphone.volumeup();
				break;

			}
		}
		System.out.println(tv.volume);
	}
}
