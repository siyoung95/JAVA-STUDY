package interfaces;
//인터페이스를 구현(상속)할 때 implements 사용, 상속한 클래스에서 추상 메소드 완성(구현)
public class Computer implements Describable{
	
	public String getDescription() {
		return "컴퓨터입니다.";
	}
}
