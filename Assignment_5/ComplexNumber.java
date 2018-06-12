import java.util.Scanner;

public class ComplexNumber {
	int r,i;
	void Display()
	{
		if(this.i<0)
			System.out.println(this.r+" "+this.i+"i");
		else
			System.out.println(this.r+" + "+this.i+"i");
	}
	public static void main(String[] args) {
		ComplexNumber obj=new ComplexNumber();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of complex number respectively ");
		 obj.r=in.nextInt();
		 obj.i=in.nextInt();
		in.close();
		obj.Display();
	}

}
