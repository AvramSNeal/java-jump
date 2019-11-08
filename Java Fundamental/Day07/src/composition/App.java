package composition;

public class App {
	public static void main(String[] args) {
		System.out.println("TESTING COMPOSITION");
		
		Computer computer = new Computer(new Processor("Intel i3"), new Memory("Kingston", "1TB"));
		computer.setSoundCard(new SoundCard("Generic Sound Card"));
		System.out.println(computer);
	}
}
