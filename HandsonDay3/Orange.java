/* Create a base class Fruit with name ,taste and size as its attributes.
Create a method called eat() which describes the name of the fruit and its taste.
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.*/

class Fruit {
	String name, taste, size;

	void eat() {
		System.out.println("Fruit Eat");
	}

}

class Apple extends Fruit {

	Apple() {
		name = "Apple";
		taste="Sweeet";
	}

	void eat() {
		System.out.println(name+" is "+taste);
	}

}

public class Orange extends Fruit {
	Orange() {
		name = "Orange";
		taste="Sour";
	}

	void eat() {
		System.out.println(name+" is "+taste);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		Apple a = new Apple();
		Orange o = new Orange();

		f.eat();
		a.eat();
		o.eat();

	}
}
