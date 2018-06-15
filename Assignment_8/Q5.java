package Assignment_8;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		 String str2 = sc.nextLine();
		 sc.close();
		 if(str1.indexOf(str2) != -1) {
				
				System.out.println("String 2 is present in string 1");
			}else {
				
				System.out.println("String 2 is not present in string 1");
			}
	}

}
