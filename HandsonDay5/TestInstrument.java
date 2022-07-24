/* Create an abstract class Instrument which is having the abstract function play.
Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message
“Piano is playing tan tan tan tan ” for Piano class
“Flute is playing toot toot toot toot” for Flute class
“Guitar is playing tin tin tin ” for Guitar class
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of play method.
Use the instanceof operator to print which object is stored at which index of instrument array. */

import java.util.Random;

abstract class Instrument{
	public abstract String play();
}

class Piano extends Instrument{

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Piano is playing tan tan tan tan ";
	}
	
}
class Flute extends Instrument{

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Flute is playing toot toot toot toot";
	}
	
}
class Guitar extends Instrument{

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Guitar is playing tin tin tin ";
	}
	
}
public class TestInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrument []i = new Instrument[10];
		
		Random r = new Random();
		for (int i1 = 0; i1 < 10; i1++) {
	    	int rnum = r.nextInt((3 - 1) + 1) + 1;
	    	
	    	if (rnum == 1)
	    		i[i1] = new Piano();
	    	else if (rnum == 2)
	    		i[i1] = new Flute();
	    	else if (rnum == 3)
	    		i[i1] = new Guitar();
	    	
	    	
	    	
//	    	System.out.println(i[i1].play());
	    	i[i1].play();
	}
		
		for (int i1 = 0; i1 < 10; i1++) {
	    	if (i[i1] instanceof Piano) 
	    		System.out.println("Piano index " + i1);
	    	else if (i[i1] instanceof Flute) 
	    		System.out.println("Flute index " + i1);
	    	else if (i[i1] instanceof Guitar) 
	    		System.out.println("Guitar index " + i1);
	    }

}
}
