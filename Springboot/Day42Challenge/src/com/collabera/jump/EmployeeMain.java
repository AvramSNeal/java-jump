package com.collabera.jump;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeMain{
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Josiah", 90000, "Engineer"));
		employees.add(new Employee("Matt", 100000, "Engineer"));
		employees.add(new Employee("Abe", 250000, "Engineer"));
		employees.add(new Employee("Terry", 250001, "Database Arch"));
		employees.add(new Employee("Roy", 2500000, "CEO"));
		employees.add(new Employee("Brian", 70000, "Dev"));
		employees.add(new Employee("Danny", Integer.MAX_VALUE, "Juggling"));
		employees.add(new Employee("Dan", 3000000, "Management"));
		employees.add(new Employee("Lee", 0, "Intern"));
		employees.add(new Employee("Terri", 350000, "Dev"));
		employees.add(new Employee("Stanley", 75000, "Dev"));
		employees.add(new Employee("Donny", 85000, "Mobile Eng"));
		employees.add(new Employee("Rebecca", 650000, "Finances"));
		
		
		List<Employee> minSalary = employees
				.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary))
				.limit(2)
				.collect(Collectors.toCollection(ArrayList::new));
		for(Employee emp : minSalary) {
			System.out.println(emp.toString());
		}
		
		System.out.println();
		
		employees
			.stream()
			.map(Employee::getDepartment)
			.distinct()
			.forEach(System.out::println);
		
		
		// vvv More Streams vvv
		System.out.println("\n-vvv More Streams vvv-");
		
		
		IntStream
		.range(1,10)
		.skip(5)
		.forEach(x-> System.out.println(x));
		
		
		
		
		
		
		
	}
	
	
	
	
}

