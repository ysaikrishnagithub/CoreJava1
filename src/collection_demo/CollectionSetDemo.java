package collection_demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetDemo {

	public static void main(String[] args) {
		System.out.println("Hashset demo");
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
		System.out.println("  Linkedhashset ");
		Set<String>g2=new LinkedHashSet<String>();
		g2.add("c");
		g2.add("s");
		g2.add("f");
		g2.add("h");
		g2.add("");
		g2.add("t");
		g2.add("y");
		g2.add("u");
		g2.add("j");
		g2.add("k");
		g2 .add("l");
		System.out.println(g2);
		System.out.println("   Treeset");	
		Set<String>g3=new TreeSet<String>();
		g3.add("c");
		g3.add("s");
		g3.add("f");
		g3.add("h");
		g3.add("");
		g3.add("t");
		g3.add("y");
		g3.add("u");
		g3.add("j");
		g3.add("k");
		g3.add("l");
		System.out.println(g3);
		
		
		

	}

}
