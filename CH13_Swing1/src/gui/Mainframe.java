package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Mainframe extends JFrame{

	public MainFrame(String title) {
		super(title); //â�� �̸��� �־ ����
		//�г� �ֱ�
		//���� ���̾ƿ� ����
		setLayout(new BorderLayout()); //â�� ������Ʈ�� ���̱� ���� ���̾ƿ�
		
		JPanel panel = new JPanel();
		panel.setBackgound(Color.GREEN);
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
