package loops;

import java.util.Scanner;

public class LoopPitfall {

	public static void main(String[] args) {

		loopPitfall();

	}
	
	public static void loopPitfall(){
		int result = 0;
		double cnt = 1.0;
		
		while (cnt <= 10.0) {
			cnt += 1.0;
			
			result++;
		}
		System.out.println(result);
		
		result = 0;
		cnt = 0.1;
		
		while (cnt <= 1.0) {
			cnt += 0.1;
			
			result++;
		}
		System.out.println(result);
		
		int i = 0;
		while(i<10) {
			
			System.out.println(i);
			i++;
		}
		
		
		
		String name;
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("Your name: ");
			name = input.nextLine();
			if(name.length()>=2)break;
			else System.out.println("Invalid Entry Homo Sapien. You must enter at least two characters.");
		}
		input.close();
	}

}
