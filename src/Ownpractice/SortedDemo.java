package Ownpractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {
		
		 List<Integer> f= new ArrayList<Integer>();
		 for(int i=0;i<=10;i++) {
			 f.add(i);
			 
		 }
		 List<Integer> sortList=f.stream().limit(3).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		 System.out.println("natural order");
		 sortList.forEach(System.out::println);
		 List<Integer> sortList1=f.stream().limit(4).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println("reverse order");
		 sortList1.forEach(x->System.out.println(x));
	}

}
