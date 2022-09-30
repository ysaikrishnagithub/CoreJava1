package practice;

//import java.util.Set;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> g=new TreeSet<Integer>();
	     g.add(3);
	     g.add(4);
	     g.add(6);
	     g.add(2);
	     g.add(1);
	     g.add(9);
	     g.add(22);
	     g.add(11);
	     g.add(12);
	     g.add(10);
	     g.add(21);
	     System.out.println("\n TreeSet");
	     System.out.println(g);
	     System.out.println("\n last------"+g.last());
	     System.out.println("\n lower----"+g.lower(4));
	     System.out.println("\n floor-----"+g.floor(2));
	     System.out.println("\n ceiling------"+g.ceiling(6));
	     System.out.println("\n higher -------"+g.higher(1));
	     System.out.println("\n pollfirst------"+g.pollFirst());
	     System.out.println("\n polllast -------"+g.pollLast());
	     System.out.println("\n subset ---------"+g.subSet(4 , 12));
	     System.out.println("\n headset ---------"+g.headSet(12));
	     System.out.println("\n tailset ----------"+g.tailSet(10));
	     
	     
	     
	}

}
