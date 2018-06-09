import java.util.Scanner;

public class AllPrimeUptoN {
	public static boolean isPrime(int x) {
	    if (x<=1||x%2==0 && x!=2)
	    	return false;
	    for(int i=3;i*i<=x;i+=2)
	    	if(x%i==0)
	            return false;
	     return true;
	}
	public static void PrintAllPrime(int x)
	{
		System.out.println("All Prime numbers upto N are: ");
		for(int i=2;i<=x;i++)
			if(isPrime(i))
				System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x=sc.nextInt();
		sc.close();
		PrintAllPrime(x);

	}

}
