import java.util.Scanner;

public class Pattern2nd {
	static void print(int n)
	{
		for(int i=n;i>0;i--)
			{
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
			}
				
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbr of lines : ");
		int x=sc.nextInt();
		sc.close();
		print(x);

	}

}
