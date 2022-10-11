package method_Overloading;

import java.util.Scanner;

class Employee{
	void run(int x,int y) {
		System.out.println("integer sum= "+(x+y));
	}
	void run(int x,int y,int z) {
		System.out.println("integer sum="+(x+y+z));
	}
}
public class Methodoverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		
		Employee s = new  Employee();
          s.run(sc.nextInt(),sc.nextInt());
          s.run(sc.nextInt(), sc.nextInt(),sc.nextInt());
	}

}
