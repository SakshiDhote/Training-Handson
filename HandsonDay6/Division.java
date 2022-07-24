/* Write a Program with a division method which receives two integer numbers and performs the division operation.
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.*/

public class Division {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			int a,b,c=0;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			try {
				c=a/b;
				System.out.println(c);
				
			}catch(ArithmeticException ae) {
				System.out.println("java.lang.ArithmeticException");
			}
			
	}

}
