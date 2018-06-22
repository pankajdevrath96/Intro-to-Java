package Assignment_13;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {


	 public static <T extends Comparable<T>> void mySort(T[] arr) {
	        T x;
	        for(int i=0;i<arr.length;i++)
	        	for(int j=0;j<arr.length-i-1;j++)
	        	{
	        		if(arr[j].compareTo(arr[j+1])>0)
	        		{
	        			x=arr[j];
	        			arr[j]=arr[j+1];
	        			arr[j+1]=x;
	        		}
	        	}	 
	 }

	    public static void main(String[] args ) {
	    	
	    	int n;
	    	Scanner sc=new Scanner(System.in);
	    	n=sc.nextInt();
	    	Integer arr1[]= new Integer[n];
	    	for(int i=0;i<n;i++)
	    		arr1[i]=sc.nextInt();
	    	mySort(arr1);
	    	for(int i=0;i<n;i++)
	    		System.out.println(arr1[i]+ " ");
	    	
	    }

}
