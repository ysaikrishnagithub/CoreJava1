package practice;
interface Dogs{
	void bark( int age) ;
}
interface Americanbully {
	static void eat() {
		System.out.println("Eating peddigree");
	}
}
public class Lab {

	public static void main(String[] args) {
		Dogs lab=(age)->System.out.println("lab bark aloud and age is "+age);
		lab.bark(20);
		Americanbully.eat();
		
	}
	
}
