package PracticeCode;

import java.util.ArrayList;
import java.util.Collections;

public class SortedBookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book2> al = new ArrayList<>();
		al.add(new Book2("test3","tester3"));
		al.add(new Book2("test2","tester2"));
		al.add(new Book2("test1","tester1"));
		
		Collections.sort(al,new nameComparator());
		
		for(Book2 list:al) {
			System.out.println(list.getName() + " "+ list.getAuthor());
		}

	}

}
