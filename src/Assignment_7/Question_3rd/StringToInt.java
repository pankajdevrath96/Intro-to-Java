package Assignment_7.Question_3rd;

import java.util.*;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		System.out.println("enter s1 and s2 respectively");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		sc.close();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
			System.out.println(a>b?a + " is greater than " + b:b + " is greater than " + a);

	}

}
