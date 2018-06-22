package Assignment_13;

import java.util.Scanner;

public class Q3 {


	 public static <T extends Comparable<T>> void myPrint(T[] arr) {
	       for(int i = 0; i< arr.length; i ++)
				
				System.out.print(arr[i]+" ");
	 }

	    public static void main(String[] args ) {
	    	
	    	int n;
	    	Scanner sc=new Scanner(System.in);
	    	n=sc.nextInt();
	    	Integer arr1[]= new Integer[n];
	    	for(int i=0;i<n;i++)
	    		arr1[i]=sc.nextInt();
	    	myPrint(arr1);
	    	System.out.println();
	    	Character arr[]={'a','b','c','f','h','w','q','p'};
	    	myPrint(arr);
	    	
	    }

}