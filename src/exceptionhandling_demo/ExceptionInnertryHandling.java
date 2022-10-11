package exceptionhandling_demo;
import java.lang.*;
public class ExceptionInnertryHandling {
	 static int a=3;
	 static String name="killer";
	public static void main(String[] args){
		try {
		int b[]= {3,6};
		try {
			b[5]=4/0;
			
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		b[6]=3;
		
		}catch(ArrayIndexOutOfBoundsException d) {
			d.printStackTrace();
			
		}
		System.out.println("innertryhandling block ");
	
		/*try {
			System.out.println("lucky number "+a);
			System.out.println("*** name="+name);
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}*/

	}

}
