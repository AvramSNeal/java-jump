package textfighter;


public class Main {

	public static void main(String[] args) {
		System.out.println("Let's play!");
		CPU cpu = new CPU();
		Player player = new Player();
		
		System.out.println("As you enter the arena, you approach your opponent!");
		cpu.initCPU();
		player.initPlayer();
		
		System.out.println("Here's the full deck: ");
		Cards cards = new Cards();
		
		cards.initDeck();
		
		//System.out.println(Arrays.toString(cards.initDeck()));
		
		//for(int i=0; i<cards.initDeck().length; i++) {
			System.out.println(cards.DECK[0]);
		//}
		
	}

}
