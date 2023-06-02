package com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 대한민국, 캐나다, 영국, 스위스의 수도를 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성
		
		HashMap<String, String> map = new HashMap<>(); // 내가한거
		map.put("대한민국", "서울"); 
		map.put("캐나다", "오타와"); 
		map.put("영국", "런던"); 
		map.put("스위스", "베른"); 
	
		esc:
		while (true) {
			System.out.print("나라를 입력하세요 >> ");
			String str = scan.next();
			if (map.get(str) == null) {
				System.out.println("다시입력하세요");
			} else if (str.equals(str)) {
				System.out.println(map.get(str));
			}
			System.out.print("계속할까요? y/n");
			String str1 = scan.next();
			if(str1.equals("y")) {
				continue;
			}else {
				break;
			}
		}
		
		// 선생님이한거
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("대한민국", "서울"); 
		map1.put("캐나다", "오타와"); 
		map1.put("영국", "런던"); 
		map1.put("스위스", "베른"); 
		
		Set<String> keys = map.keySet();
		esc:
			while(true) {
				System.out.print("나라입력 : ");
				String str1 = scan.next();
				if(keys.contains(str1)) {
					String res = map.get(str1);
					System.out.println(str1 + "의 수도는 " + res + "입니다.");
				}else {
					System.out.println("데이터에 없는 나라입니다.");
				}
				while(true) {
					System.out.print("계속할까요?(y/n) >>>");
					String msg = scan.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}else {
						continue;
					}
				}
			}
	}
}
