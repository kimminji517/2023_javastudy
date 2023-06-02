package com.ict.edu;

public class Ex05_AnimalTest {
	public static void main(String[] args) {
		// 객체 생성
		Ex05_Animal animal = new Ex05_Animal();
		// 이름 : 큰뿔소로 변경 ( = 메소드를 이용해서 변경)
		animal.setName("큰뿔소");
			
		// 나이 : 3살로 변경
		animal.setAge(3);
		// 생존여부 : 살아있음으로 변경
		animal.setLive(true);
		// 결과 출력
		String m1 = animal.getName();
		System.out.println("이름 : " + m1);
		
		int m2 = animal.getAge();
		System.out.println("나이 : " + m2);
		
		boolean m3 = animal.getLive();
		if(m3) {
			System.out.println("생사여부 : 살았음");
		}else {
			System.out.println("생사여부 : 죽었음");
		}
		System.out.println("============");
		// 이름을 펭귄, 나이 1살, 생존여부 살아있음으로 변경
		animal.setName("펭귄");
		animal.setAge(1);
		animal.setLive(true);
		
		// 결과 출력
		String p1 = animal.getName();
		System.out.println("이름 : " + p1);
		
		int p2 = animal.getAge();
		System.out.println("나이 : " + p2);
		
		boolean p3 = animal.getLive();
		if(p3) {
			System.out.println("생사여부 : 살았음");
		}else {
			System.out.println("생사여부 : 죽었음");
		}
		
		animal.play(false, 14, "엄지");
		animal.prn();
		
		animal.play("까치", 14, true);
		animal.prn();
	}
}
