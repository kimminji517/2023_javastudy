package com.ict.edu3;

public class Ex01_main {
	public static void main(String[] args) {
		System.out.println(Ex01_Interface.SU1);
		System.out.println(Ex01_Interface.SU2);
		System.out.println(Ex01_Interface.su3);
		System.out.println(Ex01_Interface.su4);

		Ex01_Interface.like();
		System.out.println();
		
		Ex01_Extends t1 = new Ex01_Extends();
		t1.sound();
		t1.play();
		
		// 익명내부클래스
		Ex01_extends2 t2 = new Ex01_extends2() {
			
			@Override
			public void sound() {
				System.out.println("뮤직듣기");
			}
			
			@Override
			public void play() {
				System.out.println("오락실게임하기");
			}
		};
		
		System.out.println(t2.name);
		t2.tour();
		t2.sound();
		t2.play();
		System.out.println();
		
		Ex01_extends4 t3 = new Ex01_extends4();
		System.out.println(t3.name);
		t3.tour();
		t3.sound();
		t3.play();
		
		/*
		 * 추천안함 Ex01_extends3 t4 = new Ex01_extends3();
		 * 
		 * @Override public void sound() {}
		 * 
		 * @Override public void play() {} };
		 */
	}
}
