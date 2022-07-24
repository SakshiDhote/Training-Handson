/*Write a program to print prime numbers between 10 and 99.*/

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=0;
		String Numbers="";
		for(int i=10;i<=99;i++) {
			int c=0;
			for(no=i;no>=1;no--) {
				if(i%no==0) {
					
					c=c+1;	
					if(c==2) {
						break;
					}
				}
			}

				Numbers=Numbers+i+" ";

			
		}
		System.out.println(Numbers);
	}

}
