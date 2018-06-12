import java.util.Scanner;
public class SecondLargest {
	public static int SecondLargestNumber(int []arr,int n)
	{
		int l=arr[0],sl=l;
		for(int i=0;i<n;i++)
			if(arr[i]>l)
			{
				sl=l;
				l=arr[i];
				
			}
			else if(arr[i]>sl)
				sl=arr[i];
		return sl;
	}
	public static void main(String[] args) {
			int arr[]=new int[10];
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 10 elements of the array : ");
			for(int i=0;i<10;i++)
				arr[i]=sc.nextInt();
			sc.close();
			System.out.print("Second largest number is "+SecondLargestNumber(arr,10));
			

	}

}
