package gui;

import javax.swing.JFrame;

public class Mainframe extends JFrame{

	public MainFrame(String title) {
		super(title); //â�� �̸��� �־ ����
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}