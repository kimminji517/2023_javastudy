package com.ict.edu5;

import javax.swing.JFrame;

public class Ex01_Swing {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Swing으로 만든 창"); // 오류발생하지만 프로젝트 내에 module-info.java 삭제하면 오류없어짐
		
		/*
		JFrame jframe = new JFrame(); // 위에 방법과 동일한 방법이라 주석처리
		jframe.setTitle("Swing으로 만든 창");
		*/
		
		// 창 크기
		jframe.setSize(600, 600);
		// 창 위치
		jframe.setLocation(0, 0);
		
		// 표시여부(기본 : false)
		jframe.setVisible(true);
	}
}
