package method_Overloding;

public class App {

	public static void main(String[] args) {
		// �޼ҵ� �����ε� (�޼ҵ�� �̸��� �Ű������� ���� ���ƾ� ���� �޼ҵ�� �����)
		Person p = new Person();
		
		p.greet();
		p.greet("���");
		System.out.println("123");
		System.out.println(123);
		System.out.println(1.23);
		
	}

}
