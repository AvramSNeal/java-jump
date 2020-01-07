package com.cognixia;

import java.util.ArrayList;
import java.util.List;

// class book 
class Book 
{ 

	public String title; 
	public String author; 
	
	Book(String title, String author) 
	{ 
		
		this.title = title; 
		this.author = author; 
	} 
} 

// Library class contains 
// list of books. 
class Library 
{ 

	// reference to refer to list of books. 
	private final List<Book> books; 
	
	Library (List<Book> books) 
	{ 
		this.books = books; 
	} 
	
	public List<Book> getTotalBooksInLibrary(){ 
		
	return books; 
	} 
	
}

class DogOverride{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends DogOverride{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
class DogOverload{
    public void bark(){
        System.out.println("woof ");
    }
 
    //overloading method
    public void bark(int num){
    	for(int i=0; i<num; i++)
    		System.out.println("woof ");
    }
}

public class JavaPrinciples {

	// Java program to illustrate 
	// the concept of Composition ; 
	
	public static void main (String[] args) 
	{ 
		
		// Creating the Objects of Book class. 
		Book b1 = new Book("Effective Java", "Joshua Bloch"); 
		Book b2 = new Book("Thinking in Java", "Bruce Eckel"); 
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt"); 
		
		// Creating the list which contains the 
		// no. of books. 
		List<Book> books = new ArrayList<Book>(); 
		books.add(b1); 
		books.add(b2); 
		books.add(b3); 
		
		Library library = new Library(books); 
		
		List<Book> bks = library.getTotalBooksInLibrary(); 
		for(Book bk : bks){ 
			
			System.out.println("Title : " + bk.title + " and "
			+" Author : " + bk.author); 
		}
		
		DogOverride dogOVR = new Hound();
        dogOVR.bark();
        
        DogOverload dogOVL = new DogOverload();
        dogOVL.bark();
        dogOVL.bark(4);
		
	}

}