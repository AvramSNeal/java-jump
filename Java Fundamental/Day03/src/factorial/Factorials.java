package factorial;

public class Factorials {

	public static void main(String[] args) {
		int n=5;
		
		//int result = factorial(n);
		int result = factorialRec(n);
		
		System.out.println("The result is " + result);

	}
	
	public static int factorial(int num) {
		int res=1, i;
		for(i=2; i<=num; i++) {
			 res *= i;
			 
		}
		return res;
	}
	
	public static int factorialRec(int num) 
    { 
        if (num == 0) 
          return 1; 
          
        return num*factorial(num-1); 
    } 

}
