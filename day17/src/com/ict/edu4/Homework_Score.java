package com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Homework_Score extends JFrame{
	public Homework_Score() {
		super("성적계산");
		
		JPanel np = new JPanel(); // 상 패널
		
		JPanel np1 = new JPanel(); // 상 - 상 패널
		JLabel jl1 = new JLabel("이름 : ");
		JTextField jtf1 = new JTextField(15);
		np1.add(jl1);
		np1.add(jtf1);
		np.add(np1);
		
		JPanel np2 = new JPanel(); // 상 - 중 패널
		JLabel jl2 = new JLabel("국어 : ");
		JTextField jtf2 = new JTextField(10);
		JLabel jl3 = new JLabel("영어 : ");
		JTextField jtf3 = new JTextField(10);
		JLabel jl4 = new JLabel("수학 : ");
		JTextField jtf4 = new JTextField(10);

		np2.add(jl2);
		np2.add(jtf2);
		np2.add(jl3);
		np2.add(jtf3);
		np2.add(jl4);
		np2.add(jtf4);
		np.add(np2);
		
		JPanel tp = new JPanel();
		tp.setLayout(null);
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동 줄바꾸기
		jta.setBounds(15, 50, 450, 400);
		tp.add(jta);
		// 편집 불가능하게 만들기
		jta.setEditable(false);

		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		add(np1, BorderLayout.NORTH);
		add(np2, BorderLayout.CENTER);
		add(tp);
		add(sp, BorderLayout.SOUTH);
		

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Homework_Score();
	}
}
