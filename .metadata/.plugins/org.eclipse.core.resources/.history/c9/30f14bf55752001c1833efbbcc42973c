package abstract_Class;

public class App {

	public static void main(String[] args) {
		// 추상 클래스
		//GameObject obj = new GameObject(); 객체를 만들 수 없다. 왜? 추상클래스로 지정해놨기 때문에
		GameObject[] objs = { new Player(), new Monster() }; //objs 객체배열에는 Player()랑 Monster() 객체가 들어있다.
		
		for(GameObject ob : objs) { // ? 
			System.out.println(ob); // ?
			ob.describe(); //구현된 추상 메소드 // 과정 : 부모클래스인 GameObject에 추상메서드를 선언하고, 자식클래스에서 추상메서드를 override해야만 메인클래스에서 사용가능
		}

	}

}
