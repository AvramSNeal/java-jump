package streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsRandom {

	public static void main(String[] args) {
		Random random = new Random();
		
		//Six random integers from 1 to 49
		random.ints(6,1,50).sorted().forEach(System.out::println);
		
		//Five random double between 0 (inclusive) and 0.5 (exclusive)
		random.doubles(5,0,0.5).sorted().forEach(System.out::println);
		
		//Boxing long to Long so they can be collected
		List<Long> longs = random.longs(5).boxed().collect(Collectors.toList());
		System.out.println(longs);

	}

}
