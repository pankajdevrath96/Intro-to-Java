import java.lang.*;
import java.util.*;
public class Animal {
	String Breed,Colour;
	void speak()
	{
		System.out.println("This is Animal class");
	}
	public static void main(String[] args) {
		Animal obj=new Animal();
		Dog obj1=new Dog();
		Cat obj2=new Cat();
		obj.speak();
		obj1.speak();
		obj2.speak();
	}
}
class Dog extends Animal {
	void speak()
	{
		System.out.println("This is Dog class");
	}
}
class Cat extends Animal{
	void speak()
	{
		System.out.println("This is Cat class");
	}
}
