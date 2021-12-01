package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Mainframe extends JFrame{

	public MainFrame(String title) {
		super(title); //창의 이름을 넣어서 생성
		//패널 넣기
		//먼저 레이아웃 선정
		setLayout(new BorderLayout()); //창에 컴포넌트를 붙이기 위한 레이아웃
		
		JPanel panel = new JPanel();
		panel.setBackgound(Color.GREEN);
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
