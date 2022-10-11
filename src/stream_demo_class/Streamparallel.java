package stream_demo_class;


import java.util.ArrayList;
import java.util.List;
public class Streamparallel {
	public static void main(String[] args) {
		List<Character> obj = new ArrayList<Character>();
		obj.add('s');
		obj.add('v');
		obj.add('d');
		obj.add('s');
		obj.add('s');
		obj.add('n');
		System.out.println("==== not in order====");
		obj.parallelStream().forEach(System.out::println);
		System.out.println("===== in order =====");
		obj.parallelStream().forEachOrdered(x->System.out.println(x));
	}

}
