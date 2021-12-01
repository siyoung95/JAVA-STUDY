package super_Constructor;

public class Employee extends Person{
	public Employee() {
		super("익명"); //부모클래스의 생성자 먼저 실행되고 자식 생성자가 실행됨
		System.out.println("Employee 생성자");
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
