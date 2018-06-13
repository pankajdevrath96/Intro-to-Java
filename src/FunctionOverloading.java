
public class FunctionOverloading {
	void print()
	{
		System.out.println("This function doesn't accept any argument");
	}
	void print(int a)
	{
		System.out.println("This function accept integer as argumet");
	}
	void print(Float y)
	{
		System.out.println("This function accept float as argument");
	}
	public static void main(String[] args) {
		FunctionOverloading obj=new FunctionOverloading();
		obj.print();
		obj.print(2);
		float x=2.3f;
		obj.print(x);
	}
}
