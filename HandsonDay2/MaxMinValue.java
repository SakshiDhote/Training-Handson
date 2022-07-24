import java.util.Scanner;

public class MaxMinValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
        n = sc.nextInt();
        int a[] = new int[n];
        int max=a[0];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
            
        }
        
        for(int j=0;j<a.length;j++) {
          if(a[j]>max) {
        	max=a[j];
        }
        }
        int min=a[0];
        for(int j=0;j<a.length;j++) {
        	
            if(a[j]<min) {
          	min=a[j];
          }
          }
       
       System.out.println(max);
       System.out.println(min);
       
	}

}
