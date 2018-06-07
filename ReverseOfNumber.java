import java.util.Scanner;

public class ReverseOfNumber {
	public static int Reverse(int x)
	{
		int z=0;
		while(x>0)
		{
			z*=10;
			z+=(x%10);
			x/=10;
		}
		return z;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		sc.close();
		System.out.println("Reversed number is "+Reverse(x));
	}
}
