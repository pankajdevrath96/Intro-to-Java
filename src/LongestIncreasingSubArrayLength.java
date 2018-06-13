import java.util.Scanner;
public class LongestIncreasingSubArrayLength {
	public static void main(String[] args) {
		int l=0,count=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements of the array ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
				{
				count++;
				if(count>l)
					l=count;
				}
			else
				count=1;
		}
		System.out.print("The length of largest increasing subarray is :"+l);
	}
}
