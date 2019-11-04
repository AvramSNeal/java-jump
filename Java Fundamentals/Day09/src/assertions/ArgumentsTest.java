package assertions;
import java.util.Arrays;
public class ArgumentsTest {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));
		assert args.length >= 2 : "Array does not contain minimum number of elements"; // Asserts error if less that 2 arguments in the array
		assert args.length < 2 : "Array contains minimum required number of elements";

	}

}
