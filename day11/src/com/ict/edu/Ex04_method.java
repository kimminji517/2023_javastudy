package com.ict.edu;

public class Ex04_method {

	int su1 = 10;
	int su2 = 20;
	int result = 0;
	
	// 메소드 이름([인자],....) 여러개 있을수 있음
	// 인자 : 메소드가 실행할때 외부에서 필요한 정보를 받기위한 통로임
	// 이름이 같지만 인자의 수나 자료형에 따라서 같은 이름의 메소드를 여러개 만들수 있다.(오버로딩, 오버로드)
	
	// 더하기
	public void add() {
		result = su1 + su2;
	}
	public void add(int k1) {
		result = k1 + su2;
	}
	public void add(int k1, int k2) {
		result = k1 + k2;
	}
	
	public int sub() {
		result = su1 - su2;
		return result;
	}
	
	public int sub(int k1) {
		int res = k1 - su2;
		return res;
	}
	
	public int sub(int k1, int k2) {
		return k1 - k2;
	}
}
