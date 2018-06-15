package Assignment_8;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows ");
		int n = sc.nextInt();
		sc.close();
		char ch;
		for(int i=0;i<n;i++)
		{
			ch='a';
			for(int j=0;j<n-i;j++) System.out.print(" ");
			for(int j=0;j<=i;j++) System.out.print(ch+++" ");
			System.out.println();
		}
	}
}
