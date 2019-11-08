package composition;

public class Computer {
	private Processor processor;
	private Memory memory;
	private SoundCard soundCard;
	
	public Computer(Processor processor, Memory memory) {
		this.processor = processor;
		this.memory = memory;
	}
	
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	public Processor getProcessor() {
		return processor;
	}
	
	public Memory getMemory() {
		return memory;
	}
	
	public SoundCard getSoundCard() {
		return soundCard;
	}
	
	@Override
	public String toString() {
		return "Computer{" + "processor=" + processor + ", memory=" + memory + " sound card=" + soundCard + "}";
	}
	
	
}
