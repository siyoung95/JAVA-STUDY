package interfaces;

public class App {

	public static void main(String[] args) {
		// �������̽�
		// Describable ds = new Describable(); ��ü�� ���� �� ����.
		Describable[] objs = { new Person(), new Computer() }; // objs ��ü�迭�� Person(), Computer() �޼��� ����
		
		for(Describable ob : objs) { //?
			System.out.println(ob.getDescription()); //?
		}
	}

}
