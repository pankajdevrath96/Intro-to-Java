import java.util.Scanner;

public class AdditionOfTwoNum {
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		System.out.println("Enter the value of y");
		int y=sc.nextInt();
		sc.close(); 
		int z=sum(x,y);
		System.out.println("Sum is " +z);
	}
}
