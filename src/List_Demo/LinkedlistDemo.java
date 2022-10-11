package List_Demo;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<Integer> a= new LinkedList<Integer>();
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(0);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(6);
		a.add(10);
		a.add(13);
		a.add(34);
		a.add(36);
		System.out.println("\n LinkedList ");
		System.out.println(a);
		LinkedList<String> a1= new LinkedList<String>();
		a1.add("sai");
		a1.add("peace");
		System.out.println("a1 "+a1);
		System.out.println(" does have containsAll----------->"+a.containsAll(a1));
		System.out.println("does have contain-------------->"+a.contains(6));
		LinkedList<Integer> a3= new LinkedList<Integer>();
		a3.add(5);
		a3.add(7);
		System.out.println("a3 "+a3);
		System.out.println("remove the value(0)"+a.remove(0));
		System.out.println("does have containsAll-------------->"+a.containsAll(a3));
		System.out.println("does have contains--------->"+a.contains(34));
		a.add(3,2);
		System.out.println(" index is  3 2added"+a);
		a.remove(3);
		System.out.println(" remove in 2 "+a);
		System.out.println(" remove for linked list---------->"+a.remove(3));
		System.out.println(a);
		System.out.println(" after remove  "+a);
		a.clear();
		System.out.println( "clear object "+a);
		System.out.println(" after cleaned---->"+a.size());
			
		
		
		
		
		

	}

}
