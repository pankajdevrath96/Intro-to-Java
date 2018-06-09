import java.util.Scanner;

public class LargestOfThreeNumber {

	public static int largest(int a,int b,int c)
	{
		return a > b ? (a > c ? a : c) : (b > c ? b : c) ;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		System.out.println("Enter the value of y");
		int y=sc.nextInt();
		System.out.println("Enter the value of z");
		int z=sc.nextInt();
		sc.close(); 
		System.out.println("Largest Value is " +largest(x,y,z));

	}

}
