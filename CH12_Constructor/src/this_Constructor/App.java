package this_Constructor;

public class App {

	public static void main(String[] args) {
		// this ������
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("���");
		System.out.println(p2);
		Person p3 = new Person("���̾�", 5);
		System.out.println(p3);
	}

}
