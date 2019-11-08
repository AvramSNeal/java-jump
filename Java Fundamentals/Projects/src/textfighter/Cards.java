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
	int atkRarity = n/(100/50);
	int defRarity = n/(100/30);
	int itmRarity = n - (atkRarity + defRarity);
	
	
	public void initDeck() {
		
	}
	
	public String[] getDeck() {
		return DECK;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void initDeck(){
//		int remainder = n-1;
//		int lastCard = 0;
//		System.out.println("Attack Rarity " + atkRarity);
//		System.out.println("Defense Rarity " + defRarity);
//		System.out.println("Item Rarity " + itmRarity);
//		System.out.println("Deck Size " + DECK.length);
//		for(int i=lastCard; i<atkRarity; i++) {
//			System.out.println(i);
//			DECK[i] = ATTACK[rand.nextInt(ATTACK.length)];
//			lastCard=i;
//			
//		}
//		remainder = remainder - lastCard;
//		System.out.println("---" + remainder +  "-" + lastCard);
//		
//		
//		for(int j=lastCard+1; j<defRarity+remainder; j++) {
//			System.out.println(j);
//			DECK[j] = DEFENSE[rand.nextInt(DEFENSE.length)];
//			lastCard=j;
//		}
//		remainder = lastCard - remainder;
//		System.out.println("---" + remainder + "-" + lastCard);
//		
//		System.out.println("Last card is " + lastCard);
//		System.out.println(itmRarity);
//		System.out.println(remainder);
//		for(int k=lastCard+1; k<(itmRarity+lastCard-2); k++) {
//			System.out.println(k);
//			DECK[k] = ITEMS[rand.nextInt(ITEMS.length)];
//			lastCard=k;
//		}
//		remainder = remainder - itmRarity;
//		System.out.println("---" + remainder +  "-" +  lastCard);
//	
//	}
//	
//	public String[] getDeck() {
//		return DECK;
//	}
	

}