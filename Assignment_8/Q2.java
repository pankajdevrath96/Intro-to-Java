package Assignment_8;

import java.util.Scanner;

public class Q2 {
	 
	static void Substrings(String str) {
				for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length()+1;j++) 
				System.out.println(str.substring(i,j));	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		Substrings(str);
	}
}
