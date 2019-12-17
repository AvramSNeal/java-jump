package com.collabera.jump;

public class SpyGame {

	public static void main(String[] args) {
		
		int[] game1 = {1,2,4,0,0,7,5};
		int[] game2 = {1,0,2,4,0,5,7};
		int[] game3 = {1,7,2,0,4,5,0};
		
		System.out.println(spy_game(game1)); // --> True
		System.out.println(spy_game(game2)); // --> True
		System.out.println(spy_game(game3)); // --> False

		
		

	}
	
	public static boolean spy_game(int game[]) {
		int count=0;
		
		for(int num : game) {
			
			if(num==0&&count<2) {
				count++;
			}
			else if(num==7&&count>=2) {
				return true;
			}
		}
		
		return false;
	}
	
	

}
