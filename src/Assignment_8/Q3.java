package Assignment_8;

import java.util.Scanner;

public class Q3 {

	public static String VowelRemove(String str)
	{
		int i=0;
		String s="";
		while(i<str.length())
		{
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U')
				s+=str.charAt(i);
			i++;
		}
	return s;
			}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println("string after removal of vowel :"+VowelRemove(str));
	}

}
