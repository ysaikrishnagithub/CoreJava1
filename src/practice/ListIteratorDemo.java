package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>f = new ArrayList<Integer>();
		f.add(22);
		f.add(12);
		f.add(23);
		f.add(24);
		f.add(26);
		f.add(27);
		f.add(2);
		f.add(21);
		System.out.println(" arraylist");
		System.out.println(f);
		System.out.println("________________________");
		ListIterator<Integer> i = f.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println("===================================^>");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
			
		}
		
	}

}
