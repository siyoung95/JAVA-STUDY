package default_Constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("����Ʈ �����ڷ� ������");
		name = "��";
		age = 0;
	}
	
	public Person(String name) { //�⺻ �����ڴ� Ŭ���� �̸��� ���� ���� Ÿ���� ����
		System.out.println("�� person�� ������");
		this.name = name;
		age = 0;
	}
	
	public Person(String name, int age) { //�⺻ �����ڴ� Ŭ���� �̸��� ���� ���� Ÿ���� ����
		System.out.println("�� person�� ������");
		this.name = name;
		this.age = age;
	}
	
	public String toStrind() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}