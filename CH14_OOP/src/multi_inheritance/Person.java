package multi_inheritance;

public class Person implements Speaker, Greeter {

	@Override
	public void greet() {
		System.out.println("ȯ���մϴ�.~");
	}

	@Override
	public void speak() {
		System.out.println("���� ��� �Դϴ�.");
		
	}

}
