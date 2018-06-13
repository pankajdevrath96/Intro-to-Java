public class StaticBlock {
	static int a,b;
	static String s;
	static{
		a=2;
		b=10;
		s="This is static block.";
	}
	public static void main(String[] args) {
		System.out.print(a+"\n"+b+"\n"+s);
	}
} 
