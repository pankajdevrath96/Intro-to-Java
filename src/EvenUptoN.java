import java.util.Scanner;

public class EvenUptoN {
	static void PrintEven(int n)
	{
		System.out.println("Even numbers upto N are ");
		for(int i=0;i<=n;i++)
			if(i%2==0)
				System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x=sc.nextInt();
		sc.close();
		PrintEven(x);

	}

}
