package com.ict.edu;

public class Ex06_method {
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	// 총점을 구하는 총점 리턴하는 메소드
	public int getSum(int kor, int eng, int math){
		sum = kor + eng + math;
		return sum;
	}
	
	// 평균을 구하는 메소드
	public double getAvg() {
		avg = (int)(sum / 3.0 * 10 / 10.0);
		return avg;
	}
	// 학점을 구하는 메소드
	public String getHak() {
		if(avg >= 90) hak = "A학점";
		else if(avg >= 80) hak = "B학점";
		else if(avg >= 70) hak = "C학점";
		else hak = "F학점";
		return hak;
	}
}
