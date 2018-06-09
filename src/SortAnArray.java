
public class SortAnArray {
//	Bubble sort(complexity O(n^2)
//	private static Object arrays;
//	public static void sort(int[] arr,int n)
//	{
//		for(int i=0;i<n-1;i++)
//			for(int j=0;j<n-i-1;j++)
//				if(arr[j]>arr[j+1])
//				{
//					int t=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=t;
//				}
//		
//	}
	
	
	//Merge sort(Complexity O(nlon(n))
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
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,1,1,1,0,0,1,0};
		int length=arr.length;
		
		sort(arr,0,length-1);
		for(int i=0;i<length;i++)
			System.out.println(arr[i]);
		}
}
