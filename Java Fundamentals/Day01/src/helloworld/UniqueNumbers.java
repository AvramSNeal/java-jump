package helloworld;

public class UniqueNumbers{

	public static void main(String[] args) {
		int count = 0;
		
		for(int x=1; x<=4; x++) {
			for(int y=1; y<=4; y++) {
				for(int z=1; z<=4; z++) {
					if(x!=y && x!=y && y!=z && x!=z) {
						System.out.println(x+""+y+""+""+z);
						count++;
					}
				}
			}
		}
		
		System.out.println("There are " + count + " possible unique numbers");

	}

}
