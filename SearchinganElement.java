import java.util.Scanner;

public class SearchinganElement {
	public static int Search(int[] arr,int n,int min,int max)
	{
		if(max>=min)
		{
			int mid=(min+max)/2;
			if(arr[mid]==n)
				return mid;
			if(arr[mid]>n)
				return Search(arr,n,min,mid-1);
				return Search(arr,n,mid+1,max);
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[] {1,4,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Ente the number you want to search ");
		int number=sc.nextInt();
		sc.close();
		int index=Search(arr,number,0,arr.length-1);
		if(index!=-1)
			System.out.print("Element indexed at " + index + " position");
		else
		System.out.print("Element not found");
		

	}

}
