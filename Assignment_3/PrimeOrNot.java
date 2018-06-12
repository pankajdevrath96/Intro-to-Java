import java.util.Scanner;

public class PrimeOrNot {
	public static boolean isPrime(int x) {
	    if (x<=1||x%2==0)
	    	return false;
	    for(int i=3;i*i<=x;i+=2)
	    	if(x%i==0)
	            return false;
	     return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check it is prime or not");
		int x=sc.nextInt();
		sc.close();
		if(isPrime(x))
			System.out.print("Yes, it is a prime number.");
		else
			System.out.println("No, the given number is not prime.");


	}

}
