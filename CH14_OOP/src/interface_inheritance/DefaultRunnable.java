package interface_inheritance;

//인터페이스끼리 상속가능
public interface DefaultRunnable extends Runnable { //사용자정의 인터페이스 DefaultRunnable 클래스는 Runnable 내장 인터페이스를 상속받음
	default void displayDetails() { //디폴트 메소드는 구현가능
		System.out.println("표시할 디테일 없음");//메서드 선언?
	}
}
