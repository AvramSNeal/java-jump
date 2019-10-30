package streams;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//		List<String> filtered = items.stream()
//				.filter(item -> !item.isEmpty())
//				.collect(Collectors.toList());
//		filtered.forEach(System.out::println);
		items.stream().filter(item -> !item.isEmpty()).forEach(System.out::println);
		
		//Stream.of("This ", "is ", "created ", "by ", "stream()").forEach(System.out::print); //Stream for Java 8
		List.of("This ", "is ", "created ", "by ", "stream()") //Only usable in Java 9+
		.stream()
		.forEach(System.out::print);
		

	}

}
