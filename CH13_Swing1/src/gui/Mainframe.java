package gui;

import javax.swing.JFrame;

public class Mainframe extends JFrame{

	public MainFrame(String title) {
		super(title); //창의 이름을 넣어서 생성
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
