package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
public class Empolyee {
	int Eid;
	String name;
	int Salary;

	public Empolyee(int eid, String name, int Salary) {
		super();
		Eid = eid;
		this.name = name;
		this.Salary = Salary;
	}
	
	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		this.Eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empolyee> r= new ArrayList<Empolyee>();
		r.add(new Empolyee(07,"Dhoni",712000));
		r.add(new Empolyee(18,"virat",132000));
		r.add(new Empolyee(93,"bumra",62000));
		r.add(new Empolyee(33,"hardik",321000));
		r.add(new Empolyee(8,"Jaddu",442000));
		r.add(new Empolyee(360,"ABD",1200000));
//		Iterator<Empolyee>li=r.iterator();
//		while(li.hasNext()) {
//			Empolyee ee=li.next();
//			if(ee.getSalary()>442000) {
//				System.out.println(ee.getSalary()+" ---> "+ee.getEid()+" ----> "+ee.getName());
//				
//			}
//			else {
//				System.out.println(ee.getSalary()+" ---> "+ee.getEid()+" ----> "+ee.getName());
//			}
//			
//			
			
//		}
		
	
		List<Empolyee>f1=r.stream().filter(x->x.getSalary()>=442000).collect(Collectors.toList());
		f1.forEach(t->System.out.println(t.getName()+" ---->"+t.getEid()+"------->"+t.getSalary()));
		
	}

	
}
