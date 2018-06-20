package Assignment_12;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		int n1,n2;
		System.out.println("Enter the number of elements you want to enter in Set1 and Set2 Resp. :");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.print("Enter the number of elements of Set1 and Set2 Resp. :");
		for(int i=0;i<n1;i++)
			set1.add(sc.nextInt());
		for(int i=0;i<n2;i++)
			set2.add(sc.nextInt());
		set1.retainAll(set2);
		System.out.print(set1);
		
//		
//		for(Integer e : set1)
//			   System.out.print(e+" ");
//			
		
		

	}

}
