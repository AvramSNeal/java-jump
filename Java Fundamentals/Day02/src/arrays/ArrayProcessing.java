package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayProcessing {

	public static void main(String[] args) {

		//getRainfall();
		getRainfall2();
	}
	
	public static void getRainfall() {
		Scanner input = new Scanner(System.in);
		double[] rainfall = new double[12];
		
		@SuppressWarnings("unused")
		double annualAverage, sum = 0.0;
		
		for(int i=0; i<rainfall.length;i++) {
			System.out.print("Rainfall for month: " + (i+1));
			rainfall[i] = input.nextDouble();
			sum += rainfall[i];
		}
		
		annualAverage = sum / rainfall.length;
		input.close();
	}
	
	public static void getRainfall2() {
		Scanner input = new Scanner(System.in);
		double[] rainfall = new double[12];
		String[] monthName = new String[12];
		Random rand = new Random();
		
		monthName[0]="January";
		monthName[1]="February";
		monthName[2]="March";
		monthName[3]="April";
		monthName[4]="May";
		monthName[5]="June";
		monthName[6]="July";
		monthName[7]="August";
		monthName[8]="September";
		monthName[9]="October";
		monthName[10]="November";
		monthName[11]="December";
		
		double annualAverage, sum = 0.0;
		
		for(int i=0; i<rainfall.length;i++) {
			System.out.print("Rainfall for " + monthName[i] + ": ");
			rainfall[i] = rand.nextInt(99); //input.nextDouble();
			sum += rainfall[i];
		}
		
		annualAverage = sum / rainfall.length;
		
		System.out.println("The average annual rainfall is " + annualAverage);
		
		double[] quarterAverage = new double[4];
		
		for(int i=0; i<4; i++) {
			sum = 0;
			for(int j=0; j<3; j++) {
				sum += rainfall[3*i+j];
			}
			quarterAverage[i] = sum/3.0;
		}
		
		System.out.println("The average rainfall 1st quarter is " + quarterAverage[0]);
		System.out.println("The average rainfall 2nd quarter is " + quarterAverage[1]);
		System.out.println("The average rainfall 3rd quarter is " + quarterAverage[2]);
		System.out.println("The average rainfall 4th quarter is " + quarterAverage[3]);
		input.close();
	}

}
