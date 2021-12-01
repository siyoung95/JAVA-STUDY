package abstract_Class;
							//이 클래스는 게임오브젝트의 자식클래스임
public class Player extends GameObject {

	@Override
	public void describe() {
		System.out.println("Player입니다.");
		
	} // 추상 클래스를 상속받았을 경우 추상 메소드를 만들어야 된다.

	
}
