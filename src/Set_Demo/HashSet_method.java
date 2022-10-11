package Set_Demo;

import java.util.HashSet;
import java.util.Set;

public class HashSet_method {

	public static void main(String[] args) {
		Set<String> a=new HashSet<String>();
		a.add("fun");
		a.add("dell");
		a.add("hp");
		a.add("asus");
		a.add("lenovo");
		System.out.println("\n hashset is --------"+a);
		System.out.println("\n size -----------"+a.size());
		System.out.println("\n isEmpty ----------"+a.isEmpty());
		System.out.println("\n contains(hp) ---------"+a.contains("hp"));
		System.out.println("\n remove(asus)-----------"+a.remove("asus"));
		System.out.println("\n hashset is --------"+a);
		System.out.println("\n after remove the name--------- "+a.remove("asus"));
		
		a.clear();
		System.out.println("clone: "+((HashSet) a).clone());

	}

}
