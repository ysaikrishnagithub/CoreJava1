package stream_demo_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DistinctDemo {

	public static void main(String[] args) {
		List<Integer> g=new ArrayList<Integer>();
		Random d = new Random();
		for(int i=0;i<=10;i++) {
			int num = d.nextInt(10);
			g.add(num);
		}
		System.out.println(g);
			List<Integer>f=g.stream().distinct().collect(Collectors.toList());
			System.out.println("distinct elements");
			System.out.println(f);
			
		}

	}


