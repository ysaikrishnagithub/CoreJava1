package inheritance_demo;
import java.util.Scanner;
class Square{
int a;
Scanner sc = new Scanner(System.in);
void input() {
	  System.out.println("enter  a value");
	  a = sc.nextInt();
}
void square() {
	  System.out.println("square="+(a*a));
}
}
class Addition extends Square{
	int b;
	void accept() {
		System.out.println("enter b value");
		b=sc.nextInt();
	
	}
	void sum() {
		System.out.println("sum="+(a+b));
	}
}
public class Inheritance {

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition f = new Addition();
		f.input();
		f.square();
		f.accept();
		f.input();
		f.sum();
		
	}

}
