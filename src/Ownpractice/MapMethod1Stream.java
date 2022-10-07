package Ownpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Students{
private String name;
private int pin;
private int marks;
public Students(String name, int pin, int marks) {
super();
this.name = name;
this.pin = pin;
this.marks = marks;
}
public String getName() {

return name;
}

public void setName(String name) {
this.name = name;
}
public int getPin() {
return pin;
}
public void setPin(int pin) {
this.pin = pin;
}
public int getMarks() {

return marks;
}

public void setMarks(int marks) {
this.marks = marks;
}
}
public class MapMethod1Stream {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Students> cl = new ArrayList<Students>();
		cl.add(new Students("sai", 128, 996));
		cl.add(new Students("vijay	", 108, 980));
		cl.add(new Students("soda	", 309, 900));
		cl.add(new Students("sashi	", 314, 950));
		cl.add(new Students("naresh", 311, 977));
		cl.add(new Students("pavan	", 320, 830));
		
		
		cl.forEach(x->System.out.println("Name:	"+x.getName()+"\n"+"PIN:	"+x.getPin()+"\n"+"Marks:	"+x.getMarks()+"\n"));
		System.out.println("adding extra 10 marks to every student\n");
		List<String> m = cl.stream().map(x-> x.getName()+" score --- "+(x.getMarks()+10)).collect(Collectors.toList());
		m.forEach(x->System.out.println(x));
		
	}

}

