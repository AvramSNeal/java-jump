package textfighter;

import java.util.Random;

public class Cards {
	
	public String[] ATTACK = {"Slash 3dmg", "Stab 5dmg", "Sweep 8dgm"};
	public String[] DEFENSE = {"Parry 2dfs", "Dodge 6dfs", "Block 9dfs"};
	public String[] ITEMS = {"God's Speed 1actn", "Health Potion 3hlth", "God's Favor 4strn"};
	Random rand = new Random();
	//initialize the deck
	int n = (ATTACK.length + DEFENSE.length + ITEMS.length) * 2;
	public String[] DECK = new String[n];
	
	public void initDeck(){
		int remainder = DECK[n].length();
		int lastCard = 0;
		for(int i=lastCard; i<(remainder/6); i++) {
			DECK[i] = ATTACK[rand.nextInt(ATTACK.length)];
			remainder--;
		}
		for(int j=lastCard; j<(remainder/2+lastCard); j++) {
			DECK[j] = DEFENSE[rand.nextInt(DEFENSE.length)];
			remainder--;
		}
		for(int k=lastCard; k<(remainder/2+lastCard); k++) {
			DECK[k] = ITEMS[rand.nextInt(ITEMS.length)];
			remainder--;
		}
	
	}
	
	public String[] getDeck() {
		return DECK;
	}
	

}