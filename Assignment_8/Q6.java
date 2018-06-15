package Assignment_8;

import java.util.Scanner;

public class Q6 {

	public static int NumberOfWords(String str)
	{
		int i=0,c=0;
		while(i<str.length())
		{
			if(str.charAt(i) ==' ')
				c++;
			i++;
		}
	return c+1;
			}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println("Number of words in given string is :"+NumberOfWords(str));
	}
}
