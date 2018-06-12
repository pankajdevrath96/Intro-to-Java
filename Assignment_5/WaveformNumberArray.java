import java.util.*;

public class WaveformNumberArray {
	 public static void merge(int arr[],int min,int mid,int max)
	    {
	        int n1=mid-min+1;
	        int n2=max-mid;
	        int arr1[]=new int [n1];
	        int arr2[]=new int [n2];
	        for (int i=0;i<n1;i++)
	            arr1[i]=arr[min+i];
	        for (int j=0;j<n2;j++)
	            arr2[j]=arr[mid+j+1];
	        int i=0,j=0;
	        int k = min;
	        while (i < n1 && j < n2)
	        {
	            if (arr1[i] <= arr2[j])
	            	arr[k++]=arr1[i++];
	            else
	            	arr[k++]=arr2[j++];
	        }
	        while (i < n1)
		        arr[k++]=arr1[i++];
	        while(j<n2)
	            arr[k++]=arr2[j++];
	    }
	   public static void sort(int arr[],int min, int max)
	    {
	        if (min<max)
	        {
		        int mid = (min+max)/2;
	            sort(arr,min,mid);
	            sort(arr,mid+1,max);
	            merge(arr,min,mid,max);
	        }
	    }
	public static void waveform(int [] arr,int n)
	{
		for(int i=1;i<n;i+=2)
		{
			int temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 10 elements of the array : ");
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		sc.close();

		sort(arr,0,arr.length-1);
		waveform(arr,10);
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);
	}

}
