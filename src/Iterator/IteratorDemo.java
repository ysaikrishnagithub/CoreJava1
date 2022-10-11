package Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		Set<String>g1=new HashSet<String>();
		g1.add("c");
		g1.add("s");
		g1.add("f");
		g1.add("h");
		g1.add("");
		g1.add("t");
		g1.add("y");
		g1.add("u");
		g1.add("j");
		g1.add("k");
		g1.add("l");
		System.out.println(g1);
		System.out.println("========================>");
		
		Iterator i =g1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		}

	}


