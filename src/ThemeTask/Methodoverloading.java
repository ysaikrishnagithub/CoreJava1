package ThemeTask;
import java.util.*;
 class Sum{
	 void add(int x,int y ) {
		 System.out.println("integer sum= "+(x+y));
	 }
	 void add(float x,float y) {
		  System.out.println("decimal sum =  "+(x+y));
	 }
 }
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		
          Sum s = new Sum();
          s.add(sc.nextInt(),sc.nextInt());
          s.add(sc.nextFloat(), sc.nextFloat());
	}

}
