package optional;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalExcercise {

	public static void main(String[] args) {
		List<Optional<String>> listOfOptionals = Arrays.asList(
				Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
		
		// - create a stream based on listOfOptionals
		// - filter list based on Optional having a value
		// - get the values from filtered Optional
		// - collect them into a List
		// - display the final list
		
		List <String> filteredList = listOfOptionals.stream()
				//.filter(Optional::isPresent)
				//.map(Optional::get)
				.filter(e->e.isPresent())
				.map(e->e.get())
				.collect(Collectors.toList());
		filteredList.forEach(System.out::println);
		
		// OR List<Optional <String>> filteredList = listOfOptionals.stream().filter(opt->opt.isEmpty()==false).collect(Collectors.toList());
		//System.out.println(filteredList);

	}

}
