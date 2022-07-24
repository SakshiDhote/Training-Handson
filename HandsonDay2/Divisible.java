/* Write a program to print first 5 values which are divisible by 2, 3, and 5. */

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int n=1;
		while(n<=1000  && c<5) {
			if(n%2==0 && n%3==0 && n%5==0) {
				System.out.println(n);
				c=c+1;
				
			}
			n++;
		}
		

	}

}
