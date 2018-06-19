package Assignment_10;

import java.io.*;
import java.util.*;

public class Q1 {

	public static void main(String[] args) throws IOException, InputMismatchException {
		File f = new File("/Users/macbook/Desktop/Hello-Git/git_commands/git-commands.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		File f1 = new File("/Users/macbook/Desktop/Hello-Git/git_commands/xyz.txt");
	    FileWriter fr1 = new FileWriter(f1);
	    BufferedWriter br1 = new BufferedWriter(fr1);
	    try {
	    	int i;
	    	do {
	    	i = br.read();
	    	if(i!=-1) {
	                br1.write((char)i);
	    		System.out.print((char)i);
	    		}
	    	
	    }while(i!=-1);
	    }
	    catch(Exception e){
	    	System.out.println("Exception Occured");
	    }
	    finally {
	    	br.close();
	    	br1.close();
	    }
	}

}
