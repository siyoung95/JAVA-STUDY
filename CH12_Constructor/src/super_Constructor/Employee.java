package super_Constructor;

public class Employee extends Person{
	public Employee() {
		super("�͸�"); //�θ�Ŭ������ ������ ���� ����ǰ� �ڽ� �����ڰ� �����
		System.out.println("Employee ������");
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee ������");
	}
}
