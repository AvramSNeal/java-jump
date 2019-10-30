package innerclass;

public class MemberInner {
	private int data = 30;

	class Inner{
		int data1=5;
		void msg() {
			System.out.println("data is : " + data);
			System.out.println("data1 is : " + data1);
		}
	}
	
	public static void main(String[] args) {
		MemberInner obj = new MemberInner();
		MemberInner.Inner in = obj.new Inner();
		in.msg();
	}
}
