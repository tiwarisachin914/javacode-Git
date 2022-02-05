package PracticeCode;

import java.util.ArrayList;
import java.util.Collections;

public class Book implements Comparable<Book>{
	String name;
	String author;
	Book(String name,String author){
		this.name = name;
		this.author = author;
	}
	public int compareTo(Book book) {
		if(name == book.name) {
			return 0;
		}
		else if(name.compareTo(book.name)>1) {
			return 1;
		}
		else
			return -1;
	}
	
	public static void main(String [] args) {
		
		ArrayList<Book> ar = new ArrayList<>();
		ar.add(new Book("name3","author3"));
		ar.add(new Book("name2","author2"));
		ar.add(new Book("name1","author1"));
		
		Collections.sort(ar);
		//Collections.sort(ar);
		
		
		for(Book list:ar) {
			System.out.println(list.name + " " + list.author);
		}
		
	}

}
