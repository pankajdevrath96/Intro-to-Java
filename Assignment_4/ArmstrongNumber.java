import java.util.Scanner;

public class ArmstrongNumber {
	public static boolean isArmstrong(int x)
	{
		int n=x,count=0,sum=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		 n=x;
		while(n>0)
		{
			int m=n%10;
			sum+=Math.pow(m, count);
			n/=10;
			
		}
		if(sum==x)
			return true;
		else
			return false;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x=sc.nextInt();
		sc.close();
		if(isArmstrong(x))
			System.out.print("Yes, " + x +" is an Armstrong number.");
		else
			System.out.print("No, " +x+ " is not an Armstongnumber.");

	}

}
