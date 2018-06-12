import java.util.Scanner;

public class Rectangle {
	int length;
	int breadth;
	public int CalculateArea()
	{
		return this.length*this.breadth;
	}
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the Rectangle respectively ");
		obj.length=in.nextInt();
		obj.breadth=in.nextInt();
		in.close();
		System.out.print("Area of the rectangle is "+obj.CalculateArea());

	}

}
