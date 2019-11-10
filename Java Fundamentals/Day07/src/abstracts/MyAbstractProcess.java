package abstracts;

public abstract class MyAbstractProcess {
	public void process() {
		stepBefore();
		action();
		stepAfter();
	
	}
	
	public void stepBefore() {
		
	}
	
	public abstract void action();
	
	public void stepAfter() {
		
	}
}
