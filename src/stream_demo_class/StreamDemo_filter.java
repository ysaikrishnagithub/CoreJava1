package stream_demo_class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo_filter {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(128, "sai	",62000));
		list.add(new Employee(103, "dhee	",38000));
		list.add(new Employee(118, "giri	",78000));
		list.add(new Employee(108, "vijay      ",  90000));
		list.add(new Employee(125, "soda	",45000));
		list.add(new Employee(122, "sasi	",46000));
		list.add(new Employee(102, "naresh	",76000));
		list.add(new Employee(113, "dasu	",68000));

		System.out.println("»»»»» Iterator All Value «««««\n");
		Iterator<Employee> li = list.iterator();
		while(li.hasNext()) {
			Employee ee=li.next();
				System.out.println(ee.getEid( )+"  "+ee. getEname()+"  "+ee.getSalary());
		}
		System.out.println("\n»»»»» Iterator Single Value «««««\n");
		
		Iterator<Employee> lii = list.iterator();
		while(lii.hasNext()) {
			Employee ee=lii.next();
			if(ee.getSalary() == 90000) {
				System.out.println(ee.getEid( )+"  "+ee. getEname()+"  "+ee.getSalary());
			}
		}
		
		System.out.println("\n»»»»» Stream Single Value «««««\n");
		List<Employee> fl = list.stream().filter(x -> x.getSalary()==90000).collect(Collectors.toList());
		fl.forEach(t ->System.out.println(t.getEid()+"  "+t.getEname()+"  "+t.getSalary()));
	}
}


