package Assignment_7.Question_2;

public class Main extends Animals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals obj=new Main();
		obj.eat();
		obj.speak();

	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		name="Thunder";
		breed="Pitbull";
		color="Black";
		System.out.println("Name :"+name+"\n"+"Breed :" +breed+"\n"+"Color :"+color+"\nPilbull eats Pet's food");
		
	}

}
