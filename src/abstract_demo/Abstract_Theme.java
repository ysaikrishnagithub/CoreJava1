package abstract_demo;
import java.util.*;
 abstract class India{
	 
	 abstract void strength();
	 abstract void popularity();
	 Scanner sc = new Scanner(System.in);
	 void run() {
		 System.out.println("enter the state");
	 }
 }
 class Ts extends India {
	 void strength() {
		System.out.println("Ts strength is depend on people ");
		
	}
	void popularity() {
		System.out.println("popularity based on collection of data ");
		
		
	}
	
 }
 class Ap extends India{
	 
	@Override
	void strength() {
		// TODO Auto-generated method stub
		System.out.println("Ap strength is depend on people ");
	}

	@Override
	void popularity() {
		// TODO Auto-generated method stub
		System.out.println("popularity based on collection of data ");
		
		System.out.println("india strength collection verify");
		
		
		
	}
	 
 }
public class Abstract_Theme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India co;
		System.out.println("______");
		co=new Ts();
		co.run();
		co.strength();
		co.popularity();
		System.out.println("______");
		co=new Ap();
		co.strength();
		co.popularity();
	}

}
