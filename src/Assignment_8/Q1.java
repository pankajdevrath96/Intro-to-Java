package Assignment_8;

import java.util.Scanner;

public class Q1 {

	public static String ReverseString(String str)
	{
		String rev = "";
		int len = str.length();
		for(int i = len-1; i >= 0; i--) {
			
			rev += str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println("Reverse of the given string is :"+ReverseString(str));

	}

}
