package hashcode_this;

public class App {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		Fox fox1 = new Fox(); //fox1
		System.out.println(fox1);
		System.out.println(fox1.toString()); //fox1
		System.out.println(fox1.hashCode());
		System.out.printf("%x \n", fox1.hashCode()); //%s = 16진수로 출력하게 해주는 용어
		
=======
		Fox fox1 = new Fox();
		System.out.println(fox1);
		System.out.println(fox1.toString());
		System.out.println(fox1.hashCode());
		System.out.printf("%x \n", fox1.hashCode());
	
>>>>>>> 2abecb58768047bb6b2669db0807998a3570dbdc
		Fox fox2 = fox1;
		System.out.println(fox2);
		System.out.println(fox2.name);
		
	}

}
