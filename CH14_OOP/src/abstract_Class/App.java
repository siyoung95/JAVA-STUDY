package abstract_Class;

public class App {

	public static void main(String[] args) {
		// �߻� Ŭ����
		//GameObject obj = new GameObject(); ��ü�� ���� �� ����. ��? �߻�Ŭ������ �����س��� ������
		GameObject[] objs = { new Player(), new Monster() }; //objs ��ü�迭���� Player()�� Monster() ��ü�� ����ִ�.
		
		for(GameObject ob : objs) { // ? 
			System.out.println(ob); // ?
			ob.describe(); //������ �߻� �޼ҵ� // ���� : �θ�Ŭ������ GameObject�� �߻�޼��带 �����ϰ�, �ڽ�Ŭ�������� �߻�޼��带 override�ؾ߸� ����Ŭ�������� ��밡��
		}

	}

}