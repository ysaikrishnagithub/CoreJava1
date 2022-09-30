package practice;
import java.util.*;
abstract class Animals{
	abstract void lifeSpan();
	 abstract void breath();
	
 }
class Camel extends Animals{
	
	@Override
	void lifeSpan() {
		// TODO Auto-generated method stub
		System.out.println("The camel  life span  is unexpected");
	}

	@Override
	void breath() {
		// TODO Auto-generated method stub
		System.out.println("breath from O2 level");
	}
	
}
class Bull extends Animals{

	@Override
	void lifeSpan() {
		// TODO Auto-generated method stub
		System.out.println("The bull life span also unexpected");
	}

	@Override
	void breath() {
		// TODO Auto-generated method stub
		System.out.println("breath from O2 level");
	}
	
}
public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animals co2;
			System.out.println("enter animals conditions");
			System.out.println("___________");
			co2=new Camel();
			co2.lifeSpan();
			co2.breath();
			System.out.println("___________");
			co2=new Bull();
			co2.lifeSpan();
			co2.breath();
	}

}
