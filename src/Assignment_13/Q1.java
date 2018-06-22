package Assignment_13;


import java.util.HashMap;
import java.util.Scanner;

public class Q1 {


	public static HashMap<String, String> myDate = new HashMap<String, String>();
	public static HashMap<String, String> myMonth = new HashMap<String, String>();
	public static HashMap<String, String> fYear = new HashMap<String, String>();
	public static HashMap<String, String> mYear = new HashMap<String, String>();
	public static HashMap<String, String> lYear = new HashMap<String, String>();

	public static void translateData() {
		
		myMonth.put("01", "January");
		myMonth.put("02", "February");
		myMonth.put("03", "March");
		myMonth.put("04", "April");
		myMonth.put("05", "May");
		myMonth.put("06", "June");
		myMonth.put("07", "July");
		myMonth.put("08", "August");
		myMonth.put("09", "September");
		myMonth.put("10", "October");
		myMonth.put("11", "November");
		myMonth.put("12", "December");
		
		
		
		
		myDate.put("01", "First");
		myDate.put("02", "Second");
		myDate.put("03", "Third");
		myDate.put("04", "Fourth");
		myDate.put("05", "Fifth");
		myDate.put("06", "Sixth");
		myDate.put("07", "Seventh");
		myDate.put("08", "Eighth");
		myDate.put("09", "Nineth");
		myDate.put("10", "Tenth");
		myDate.put("11", "Eleventh");
		myDate.put("12", "Tweleveth");
		myDate.put("13", "Thirteenth");
		myDate.put("14", "Fourteenth");
		myDate.put("15", "Fifteenth");
		myDate.put("16", "Sixteenth");
		myDate.put("17", "Seventeenth");
		myDate.put("18", "Eighteenth");
		myDate.put("19", "Nineteenth");
		myDate.put("20", "Twenty");
		myDate.put("21", "Twenty First");
		myDate.put("22", "Twenty Second");
		myDate.put("23", "Twenty Third");
		myDate.put("24", "Twenty Fourth");
		myDate.put("25", "Twent Fifth");
		myDate.put("26", "Twenty Sixth");
		myDate.put("27", "Twenty Seventh");
		myDate.put("28", "Twenty Eighth");
		myDate.put("29", "Twenty Nineth");
		myDate.put("30", "Thirty");
		myDate.put("31", "Thirty First");

		
		fYear.put("18", "Eighteen Hundred");
		fYear.put("19", "Nineteen Hundred");
		fYear.put("20","Twenty Hundred");
		fYear.put("21", "Twentyone Hundred");

		mYear.put("0", "Hundred");
		mYear.put("1", "Ten");
		mYear.put("2", "Twenty");
		mYear.put("3", "Thirty");
		mYear.put("4", "Forty");
		mYear.put("5", "Fifty");
		mYear.put("6", "Sixty");
		mYear.put("7", "Seventy");
		mYear.put("8", "Eighty");
		mYear.put("9", "Ninety"); 
		
		lYear.put("0", "");
		lYear.put("1", "One");
		lYear.put("2", "Two");
		lYear.put("3", "Three");
		lYear.put("4", "Four");
		lYear.put("5", "Five");
		lYear.put("6", "Six");
		lYear.put("7", "Seven");
		lYear.put("8", "Eight");
		lYear.put("9", "Nine");
	}
	
	public static String printDate(String s) {
		
		translateData();
	
	    String d = s.substring(0, 2);
		String m = s.substring(3, 5);
		String yF = s.substring(6, 8);
		String yM = s.substring(8, 9);
		String yL = s.substring(9, 10);
	
		return myDate.get(d) + " " + myMonth.get(m) + " " + fYear.get(yF) +" "+mYear.get(yM)+ " " + lYear.get(yL);
	}
	
  public static void main(String args[]) {
	 
	  System.out.print("Enter the date in DD/MM/YYYY format :");
	  Scanner sc=new Scanner(System.in);
	  String str;
	  str=sc.nextLine();
	  System.out.println(printDate(str));
  
  } 
}
