package PracticeCode;

import java.util.Comparator;

public class nameComparator implements Comparator<Book2> {
	public int compare(Book2 b1, Book2 b2) {
		return b1.getName().compareTo(b2.getName());
	}

}
