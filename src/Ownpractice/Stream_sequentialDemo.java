package Ownpractice;

import java.util.ArrayList;
import java.util.List;
	

public class Stream_sequentialDemo {
	public static void main(String[] args) {
		List<Character> obj = new ArrayList<Character>();
		obj.add('s');
		obj.add('d');
		obj.add('s');
		obj.add('v');
		obj.add('s');
		obj.add('n');
		obj.stream().forEach(x->System.out.println(x));
		}
}
