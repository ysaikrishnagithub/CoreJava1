package practice;

import java.nio.ShortBuffer;

public class Strings {
	 public static  void bufferString() {
		 StringBuffer s = new StringBuffer(" I love India ");
		 s.append(" that  is my country");
		 System.out.println(s);
		 
	 }
	 public static  void buildstring() {
		 StringBuffer s = new StringBuffer(" I am good ");
		 s.append("team players");
		 System.out.println(s);
	 }

	public static void main(java.lang.String[] args) {
		String s = "India";
		s.concat(" is my country");
		System.out.println(s);
	String d = s.concat(" is my country");
		System.out.println("concat method:"+d);
		System.out.println("contains method ="+d.contains("India"));
		System.out.println(s.equals("India"));
		System.out.println(s == "India");
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println("substring ="+d.substring(4));
		System.out.println(" substring two index ="+d.substring(3,13));
		System.out.println(" uppercase = "+d.toUpperCase());
		System.out.println(" lowercase="+d.toLowerCase());
		String k ="        i love my country       " ;
		System.out.println("trim:"+k.trim());
		System.out.println("___spilt_____");
		String[] x = d.split(" ");
		for( String f:x) {
			System.out.println(f);
		}
		bufferString();
		buildstring();
	}

}
