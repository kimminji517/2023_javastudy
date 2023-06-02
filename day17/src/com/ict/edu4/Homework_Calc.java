package com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class Homework_Calc extends JFrame{
	public Homework_Calc() {
		super("계산기");

		JPanel jp = new JPanel();
		JTextField jtf1 = new JTextField();
		jtf1.setColumns(25);
		jp.add(jtf1);
		
		JPanel np = new JPanel(new GridLayout(5,4,10,10));
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb10 = new JButton("0");
		JButton jb11 = new JButton("+");
		JButton jb12 = new JButton("-");
		JButton jb13 = new JButton("*");
		JButton jb14 = new JButton("/");
		JButton jb15 = new JButton("=");
			
		
		np.add(jb1);
		np.add(jb2);
		np.add(jb3);
		np.add(jb4);
		np.add(jb5);
		np.add(jb6);
		np.add(jb7);
		np.add(jb8);
		np.add(jb9);
		np.add(jb10);
		np.add(jb11);
		np.add(jb12);
		np.add(jb13);
		np.add(jb14);
		np.add(jb15);
		
		add(jp,BorderLayout.NORTH);
		add(np);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 200, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Homework_Calc();
	}
}
