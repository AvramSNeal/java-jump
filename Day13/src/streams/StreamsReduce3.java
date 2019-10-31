package streams;

import java.util.*;
/**
 * Stream.reduce(): a stream reduces to single resultant value
 * T reduce(T identity, BinaryOperator<T> accumulator);
 */
public class StreamsReduce3 {

	public static void main(String[] args) {
		// Creating list of integers
		List<Integer> array = Arrays.asList(-2,0,4,6,8);
		
		//Finding sum of all elements
		Optional<Integer> sum = array.stream()
				.skip(2) // skips to the indicated element
				.limit(4) // limits the stream to the first 4 elements e.g. (-2,0,4,6)
				.reduce((element1,element2)->element1+element2);
//		int sum1 = array.stream()
//				.limit(4)
//				.skip(5)
//				.reduce(0,(element1,element2)->element1+element2);
		
		//Displaying sum of all elements
		System.out.println("The sum of all elements is " + sum);

	}

}
