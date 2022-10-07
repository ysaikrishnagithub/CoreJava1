package practice;

import java.util.Optional;

public class OpticalDemo {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[0]="Jaram";
		System.out.println(str[0]+"<-->"+str[0].length());
		Optional<String> oc = Optional.ofNullable(str[1]);
		if(oc.isPresent()) {
			System.out.println(str[1].length());
		}
		else {
			System.out.println("String is null");
		}
		System.out.println("hospital--1");
		System.out.println("hospital--2");
		System.out.println("hospital--3");
		System.out.println("hospital--4");
		System.out.println("hospital--5");
		
		System.out.println("\nafter Null pointer Exception");
		
	}

}
