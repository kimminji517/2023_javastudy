package com.ict.edu;

public class Ex07_Constructor {
	private String name = "홍길동";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";
	
	// 생성자
	public Ex07_Constructor() {
	}
	public Ex07_Constructor(String name) {
		// 생성자에서 다른 생성자 호출 할 수 있다.
		// 무조건 첫째줄에서 호출해야함 19행 참고
		// 생성자 이름을 사용하면 안됨 이름대신 this 사용해야함 21행 참고
		this(70, 80, 70);
		this.name = name;
		// Ex07_Constructor(70, 80, 70); 둘째줄이라 안됨
	}
	
	public Ex07_Constructor(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 총점 구하기
	public void gSum(int kor, int eng, int math){
		sum = kor + eng + math;
	}
	public void gSum(){
		sum = kor + eng + math;
	}
	
	// 평균 구하기
	public void gAvg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
	public void gHak() {
		if(avg >= 90) {
			hak = "A";
		}else if(avg >= 80) {
			hak = "B";
		}else if(avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
	}	
		// 출력하는 메소드
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
}
