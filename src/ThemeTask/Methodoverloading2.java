package ThemeTask;

import java.util.Scanner;

class Student2{
	 void memo(int x,float y ) {
		 System.out.println("integer sum= "+(x+y));
	 }
	 void memo(float x,int y) {
		  System.out.println("decimal sum =  "+(x+y));
	 }
}
public class Methodoverloading2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		
          Student2 s = new  Student2();
          s.memo(sc.nextInt(),sc.nextFloat());
          s.memo(sc.nextFloat(), sc.nextInt());
	}
	}


