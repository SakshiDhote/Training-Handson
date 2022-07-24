/*Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/

class Animal{
	
	void eat(){
		System.out.println("Animal Eat");
	}
	
	void sleep(){
		System.out.println("Animal sleep");
	}
	
}
public class Bird extends Animal {
	
	void eat(){
		System.out.println("Bird Eat");
	}
	
	void sleep(){
		System.out.println("Bird sleep");
	}
	void fly() {
		System.out.println("Bird Fly");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ob = new Animal();
		
		System.out.println("Animal Class");
		ob.eat();
		ob.sleep();
		System.out.println();
		System.out.println("Bird Class");
		
		Bird ob1=new Bird();
		ob1.eat();
		ob1.sleep();
		ob1.fly();
		
	}

}
