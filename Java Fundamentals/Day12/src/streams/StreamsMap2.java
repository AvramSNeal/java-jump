package streams;

import java.util.*;

public class StreamsMap2 {

	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		books.put("978-0201633610", "Design patterns");
		books.put("978-1617291999", "Java 8 in Action");
		books.put("978-0134685991", "Effective in Java");
		
		//find the ISBN for the book with the title "Effective Java"
		Optional<String> optionalISBN = books
				.entrySet()
				.stream()
				.filter(entry -> "Effective in Java".equals(entry.getValue()))//OR .filter(entry -> entry.getValue().startsWith("Effective in Java"))
				.map(Map.Entry::getKey)//OR .map(entry->entry.getKey())
				.findFirst(); // then we return the Optional via findFirst();
		
		optionalISBN.ifPresent(System.out::println);

	}

}
