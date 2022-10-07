package practice;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> r = new TreeMap<String,Integer>();
		r.put("peace", 1011);
		r.put("american", 1010);
		r.put("hulk", 1019);
		r.put("stark", 1002);
		r.put("naruto", 1000);
		r.put("panda", 1900);
		r.put("virat", 1012);
		System.out.println(r);
		System.out.println("======================================>");
//		Set u = r.entrySet();
//		Iterator i = u.iterator();;
//		while(i.hasNext()){
//			Entry<String,Integer> f = (Entry<String, Integer>) i.next();
//			System.out.println(f);
//		}
		
	//	r.forEach((key,value)->System.out.println(key+""+value));
		for(Map.Entry<String, Integer> f : r.entrySet()) {
			System.out.println(f.getKey()+" "+f.getValue());
		}
		
		
		
		
	}

	
}
