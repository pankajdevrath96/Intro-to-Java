import java.util.Scanner;

public class LeapYear {
	public static boolean isLeap(int a)
	{
		if(a%400==0)
			return true;
		else if(a%100==0)
			return false;
		else if(a%4==0) 
			return true;
		else
			return false;
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close(); 
		if(isLeap(x))
			System.out.println("Yes");
		else
			System.out.print("No");

	}

}
