public class TheOtherTwoMainsCaller {

	public static void main(String[] args) {
		System.out.println("TheOtherTwoMainsCaller started");
		FirstMain a = new FirstMain();
		a.SayHello();
		SecondMain b = new SecondMain();
		b.SayHello();

	}

}
