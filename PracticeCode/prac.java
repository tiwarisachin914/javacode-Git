package PracticeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// import packages
public class prac{

	public static void main(String[] args) {
		String s = "My name is Sachin Tiwari";
		
		String [] str = s.split(" ");

		Arrays.sort(str,new StringComparator());
		System.out.println(Arrays.toString(str));
	}

}
