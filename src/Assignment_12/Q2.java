package Assignment_12;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		int n;
		System.out.println("Enter the number of elements you want to enter in HashMap :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the elements you want to enter in HashMap with proper values (Integer and String) :");
		for(int i=0;i<n;i++)
			map.put(((Integer)sc.nextInt()),sc.next());
		  for(Map.Entry e:map.entrySet())
		   System.out.println(e.getKey()+" "+e.getValue());
		 } 
}


