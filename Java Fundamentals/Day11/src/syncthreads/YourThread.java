package syncthreads;

public class YourThread extends Thread {
	
	Printer pRef;
	
	YourThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		//synchronized(pRef) {
			pRef.printDocument(10, "JimmysResume.pdf");
		//}
	}
}
