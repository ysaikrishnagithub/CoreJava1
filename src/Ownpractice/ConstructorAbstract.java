package Ownpractice;
import java.util.*;
 abstract class Market{
	 int a;
	 int b;
	 Market( int a,int b){
	  
     }
	 abstract void center();
	 void print() {
		 System.out.println("________");
	 }
  }
 class Customer extends Market{
	 Customer(int a,int b){
		 super(a,b);
		 System.out.println("sum = "+(a+b));
		 
	 }

	@Override
	void center() {
		// TODO Auto-generated method stub
		System.out.println("vegatables");
	}
 }
 class Service extends Market{
	 Service(int a,int b){
		 super(a,b);
		 System.out.println("area="+(a*b));
		 
	 }

	@Override
	void center() {
		// TODO Auto-generated method stub
		System.out.println("product");
	}
	
 }
public class ConstructorAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter values");
        Market dl;
        dl=new Customer(sc.nextInt(),sc.nextInt());
        dl.print();
        dl.center();
        System.out.println("enter 2 values");
        dl=new Service(sc.nextInt(),sc.nextInt());
        dl.print();
        dl.center();
        
        
        
	}

}
