package method_Overloding;

public class Person {
		//�̸��� ���� �׸�Ʈ �޼ҵ尡 2��
		//�Ű������� �ٸ��� �ٸ� �޼ҵ�
		public void greet() {
			System.out.println("��ο�!");
		}
		
		public void greet(String name) {
			System.out.println("��ο�!" + name);
		}
			
		public void greet(int height) {
			if(height > 185) {
				System.out.println("Ű�� ũ����!");
			}
			System.out.println("��ο�~~");
		}
		
		public void greet(String name, int height) {
			if(height > 185) {
				System.out.println("Ű�� ũ����!");
			}
			System.out.println("��ο�~~" + name);
		}
}
