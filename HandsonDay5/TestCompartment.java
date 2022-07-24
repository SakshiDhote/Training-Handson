/* Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.
Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
*/


import java.util.Random;

abstract class Compartment {
	public abstract String notice();

}

class FirstClass extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "FirstClass";
	}

}

class Ladies extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "Ladies";
	}

}

class General extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "General";
	}

}

class Luggage extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "Luggage";
	}

}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] c = new Compartment[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
	    	int rnum = r.nextInt((4 - 1) + 1) + 1;
	    	
	    	if (rnum == 1)
	    		c[i] = new FirstClass();
	    	else if (rnum == 2)
	    		c[i] = new Ladies();
	    	else if (rnum == 3)
	    		c[i] = new General();
	    	else if (rnum == 4)
	    		c[i] = new Luggage();
	    	
	    	
	    	System.out.println(c[i].notice());
	    }
	}

}
