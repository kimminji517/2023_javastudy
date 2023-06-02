package com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_method t1 = new Ex03_method();
		
		/* 약간 비정상적인 방법
		t1.getSum(); // 실행됨
		t1.getAvg();
		t1.getHak();
		
		System.out.println(t1.sum);
		System.out.println(t1.avg);
		System.out.println(t1.hak);
		*/
		
		// return있으면 무조건 받아주는게 좋음, 아래처럼 받는곳이 있어야함
		int k1 = t1.getSum();
		double k2 = t1.getAvg();
		String k3 = t1.getHak();
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
	}
}
