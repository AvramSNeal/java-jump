package prime;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String args[]) {
		
		int i,m=0,flag=0;
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = input.nextInt();
		
		
		
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n + " is not a prime number.");
		}else {
			for(i=2;i<=m;i++){      
				if(n%i==0){      
			    	System.out.println(n+" is not prime number");      
			    	System.out.println(m+" is " + n + " divided by 2(rounded down)");      
			    	flag=1;      
			    	break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}
		
		input.close();
	}
}
