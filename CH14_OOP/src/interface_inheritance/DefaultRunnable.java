package interface_inheritance;

//�������̽����� ��Ӱ���
public interface DefaultRunnable extends Runnable { //��������� �������̽� DefaultRunnable Ŭ������ Runnable ���� �������̽��� ��ӹ���
	default void displayDetails() { //����Ʈ �޼ҵ�� ��������
		System.out.println("ǥ���� ������ ����");//�޼��� ����?
	}
}
