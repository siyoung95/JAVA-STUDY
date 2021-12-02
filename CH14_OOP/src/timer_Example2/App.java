package timer_Example2;

<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
>>>>>>> 2abecb58768047bb6b2669db0807998a3570dbdc
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

<<<<<<< HEAD

class Task2 implements Runnable { //scheduleAtFixedRate메서드에 Task 넣기, 1. Task라는 클래스를 생성 implements - ?

	@Override // 2. Task 사용자 정의 클래스 Override ?
	public void run() { //Runnable의 추상메소드를 구현(완성)한다. // Runnable - ?
		//3. 할 일의 코드를 적는다.
		System.out.println("타이머2 헬로우~");
	}
	
class Task1 extends TimerTask {

	@Override
	public void run() {
		System.out.println("타이머1 헬로우");
		
	}
	
}
	
}
=======
class Task implements Runnable{

	@Override
	public void run() { // Runnable의 추상메소드를 구현(완성)한다
		// 할일의 코드를 적는다
		System.out.println("헬로우!");
	}
	
}
>>>>>>> 2abecb58768047bb6b2669db0807998a3570dbdc

public class App {

	public static void main(String[] args) {
<<<<<<< HEAD
		//타이머 1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 0, 1000);
		
		// 타이머 2
		ScheduledExecutorService excutor = Executors.newScheduledThreadPool(1);
		
		excutor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS); //1초에 한번씩 반복
=======
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS); // 1초에 한번씩 반복 

>>>>>>> 2abecb58768047bb6b2669db0807998a3570dbdc
	}

}
