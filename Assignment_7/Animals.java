package Assignment_7;

public interface Animals {
	void eat();
	void speak();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		Cat c = new Cat();
		d.speak();
		d.eat();
		c.speak();
		c.eat();

	}

}
 class Cat implements Animals{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Milk");
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("This is cat class");
		
	}
}

 class Dog implements Animals{

	@Override
	public void eat() {
		System.out.println("Bread");
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("This is Dog class");
		
	}

}
