package ribi;

public class Prime {

	public static void main(String[] args) {
		if (isPrime(1) != false) { System.out.println("ERROR 1"); }
		if (isPrime(2) != true ) { System.out.println("ERROR 2"); }
		if (isPrime(3) != true ) { System.out.println("ERROR 3"); }
		if (isPrime(4) != false) { System.out.println("ERROR 4"); }
		if (isPrime(993) != false) { System.out.println("ERROR 5"); }
		if (isPrime(997) != true) { System.out.println("ERROR 6"); }

		System.out.println("Tested class Prime");
	}

    public static boolean isPrime(final int number) {
    	if (number < 2) return false;
    	for (int i=2; i!=number; ++i)
    	{
    		if (number % i == 0) return false;
    	}
    	return true;
    }
}
