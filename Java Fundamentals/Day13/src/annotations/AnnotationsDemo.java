package annotations;

class B{
	void showWithAVeryVerylongName() {
		System.out.println("Show in B");
	}
}

public class AnnotationsDemo extends B{

	public static void main(String[] args) {
		AnnotationsDemo demo = new AnnotationsDemo();
		demo.showWithAVeryVerylongName();

	}
	
	@Override
	public void showWithAVeryVerylongName() {
		System.out.println("Show in Demo");
	}

}
