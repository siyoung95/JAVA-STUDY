package gui;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.Color;
=======
>>>>>>> 2abecb58768047bb6b2669db0807998a3570dbdc

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) { // 생성자
		super(title); // 창의 이름을 넣어서 생성
		
		// 먼저 레이아웃 설정
		setLayout(new BorderLayout()); // 창에 컴포넌트를 붙이기 위한 레이아웃 설정
		
<<<<<<< HEAD
//		JPanel panel = new JPanel(); // 패널을 생성
//		panel.setBackground(Color.GREEN); // 패널의 녹색 설정
		
		final MainPanel mainPanel = new MainPanel();
//		mainPanel.setBackground(Color.CYAN);
		
		
		add(mainPanel, BorderLayout.CENTER); // 위에서 만든 패널을 레이아웃의 가운데 붙이기
=======
		final MainPanel mainPanel = new MainPanel();
		// mainPanel.setBackground(Color.cyan);
		add(mainPanel, BorderLayout.CENTER); // 위에서 만든 패널을 레이아웃의 가운데 붙이기
		
>>>>>>> 2abecb58768047bb6b2669db0807998a3570dbdc
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
