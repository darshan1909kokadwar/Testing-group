package superandthis;

public class Animal {
    String color="white";
}
	
	class Dog extends Animal
	{
		String color= "Black";
	
	void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

}