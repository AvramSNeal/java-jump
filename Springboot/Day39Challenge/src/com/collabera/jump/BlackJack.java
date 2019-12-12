package com.collabera.jump;

import java.util.Random;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(playGame());

	}
	
	private static String playGame() {
		
		Random rand = new Random();
		
		int a = rand.nextInt(11)+1;
		int b = rand.nextInt(11)+1;
		int c = rand.nextInt(11)+1;
		int sum = a + b + c;
		
		if(sum<=21) {
			return "" + sum + "";
		} else {
			if(a==11 || b==11 || c==11) {
				sum -= 10;
				if(sum>21) {
					return "BUST";
				} else {
					return "" + sum + "";
				}
			} else {
				return "BUST";
			}
		}
		
		
	}

}
