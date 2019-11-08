package syncthreads;

public class Printer {
	synchronized void printDocument(int nrOfCopies, String docName) {
		for(int i=1; i<=10; i++) {
			System.out.println(" * Printing " + docName + " " + i);
		}
	}
}
