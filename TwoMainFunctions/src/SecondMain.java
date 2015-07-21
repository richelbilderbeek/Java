
public class SecondMain {

	public static void main(String[] args) {

		System.out.println("Started SecondMain");

		FirstMain first_main = new FirstMain();
		first_main.SayHello();
		SecondMain second_main = new SecondMain();
		second_main.SayHello();

	}
	public void SayHello() {
		System.out.println("Hello from SecondMain");
		
	}

}
