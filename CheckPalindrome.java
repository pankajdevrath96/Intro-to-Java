import java.util.Scanner;

public class CheckPalindrome {
	public static boolean Palindrome(int x)
	{
		int y=x;
		int z=0;
		while(y>0)
		{
			z*=10;
			z+=(y%10);
			y/=10;
		}
		if(z==x)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		sc.close();
		if(Palindrome(x))
			System.out.println("Yes, the number is palindrome");
		else
			System.out.println("No, the number is not palindrome");
	}
}
