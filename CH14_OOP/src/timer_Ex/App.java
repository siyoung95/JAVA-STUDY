package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

class Task1 extends TimerTask{
	private int i = 0;
	
	@Override
	public void run() { 
		i += 1; //?
		System.out.println("계란 삶는 중" +i); //?
		
	}
}

class Task2 extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}
	
}
	


public class App {

	public static void main(String[] args) {
		// 1. 5초 간격 타이머 "계란 삶는 중"
		//2. 30초 간격 타이머 "계란 삶기 완료"
		System.out.println("계란 삶기를 시작합니다");
		
		Timer Timer1 = new Timer(); //5sTimer이름의 타이머 객체 생성
		Timer1.scheduleAtFixedRate(new Task1(), 5000, 5000); // scheduleAtFrixedRate (객체, 시작후 실행시간, 반복주기)
		
		Timer Timer2 = new Timer(); //
		Timer2.scheduleAtFixedRate(new Task2(), 30000, 30000);
		
	}

}
