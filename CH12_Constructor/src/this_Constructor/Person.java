package this_Constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		// this() 생성자
		this("익명", 0); // this("익명") , 나이를 입력안해도 왜 age=0이 출력이 될까?
	}
	
	public Person(String name) { //기본 생성자는 클래스 이름과 같고 리턴 타입이 없음
		this(name, 0);
	}
	
	public Person(String name, int age) { //기본 생성자는 클래스 이름과 같고 리턴 타입이 없음
		this.name = name;
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
