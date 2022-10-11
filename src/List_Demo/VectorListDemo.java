package List_Demo;
import java.util.Vector;

public class VectorListDemo {

	public static void main(String[] args) {
		Vector<Integer>d = new Vector<Integer>();
		d.add(4);
		d.add(5);
		d.add(67);
		d.add(56);
		d.add(98);
		d.add(32);
		d.add(66);
		d.add(34);
		d.add(0);
		d.add(54);
		d.add(44);
		d.add(48);
		d.add(74);
		System.out.println(d);
		System.out.println(""+d.get(8)); 
		d.set(5,78);
		System.out.println("\n vector list");
		System.out.println(d);
		System.out.println(" size "+d.size());
		System.out.println("last"+d.lastIndexOf(98));
		System.out.println("floor"+d);
		System.out.println("");
		System.out.println(" containsAll"+d.containsAll(d));
		System.out.println("vector contains -------->"+d.contains(66));
		System.out.println(" index ----->"+d.indexOf(4));
		System.out.println(" is empty ----->"+d.isEmpty());
		System.out.println("remove is ----->"+d.remove(5));
		d.clear();
		System.out.println("clear object"+d);
		System.out.println(""+d.size());
		
		

	}

}
