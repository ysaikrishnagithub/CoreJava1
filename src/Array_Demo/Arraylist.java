package Array_Demo;

import java.util.ArrayList;
import java.util.Set;

public class Arraylist {

	public static void main(String[] args) {
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
		
		ArrayList<String>f1 = new ArrayList<String>();
		f1.add("duke");
		f1.add("jaguar");
		System.out.println("f1 "+f1);
		System.out.println("does obj contains all obj 1 elements"+f.containsAll(f1));
		ArrayList<Integer>f3 = new ArrayList<Integer>();
		f3.add(12);
		f3.add(22);
		System.out.println("f3"+f3);
		System.out.println("does obj contains all  obj 3 elements  "+f.containsAll(f3));
		System.out.println(" does contains :"+f.contains(12));
		System.out.println("..."+f);
		f.add(4,2);
		System.out.println( "index 21 2 is added :"+f);
		f.remove(4);
		System.out.println( "does remove 2 :"+f);
		System.out.println( "size "+f.size());
		f.clear();
		System.out.println(" clear object "+f);
		System.out.println(" aftwer cleaned :"+f.size());
		
		
		
		

	}

}
