package lambdas;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 1. Test Method Ref ::println
 *
 */


public class MethodReferenceTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jacob");
		names.add("Jingleheimer");
		names.add("Schmidt");
		names.forEach(n -> {
			System.out.println(n);
		});

	}

}
