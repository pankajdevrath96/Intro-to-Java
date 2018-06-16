package Assignment_9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Q1 {

	public static void main(String[] args) throws IOException{
	    File f = new File("/Users/macbook/Desktop/Hello-Git/git_commands/git-commands.txt");
	    FileReader sc= null;

		 int i;
	    try {
	        sc=new FileReader(f);
	     
	      while((i=sc.read())!=-1)
	           System.out.print((char)i);
			} 
	    catch(Exception e) {
	        System.out.println("End_of_file");
	    }
	      finally {
	       if(sc!=null)
	       sc.close();
	       }


}
}
