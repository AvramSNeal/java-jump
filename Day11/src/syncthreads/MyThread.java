package syncthreads;

public class MyThread extends Thread {
	
	Printer pRef;
	
	MyThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		//synchronized(pRef) {
			pRef.printDocument(10, "JohnsResume.pdf");
		//}
	}
}
