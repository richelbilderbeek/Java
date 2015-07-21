
public class FirstMain {

	public static void main(String[] args) {
			System.out.println("Started FirstMain");

			FirstMain first_main = new FirstMain();
			first_main.SayHello();
			SecondMain second_main = new SecondMain();
			second_main.SayHello();
		}
		public void SayHello() {
			System.out.println("Hello from FirstMain");
			
		}

}
