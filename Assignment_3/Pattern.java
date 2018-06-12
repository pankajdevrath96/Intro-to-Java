import java.util.Scanner;
public class Pattern {
	public static void print(int x)
	{
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		 }	
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines ");
		int x=sc.nextInt();
		sc.close(); 
		print(x);

	}

}
