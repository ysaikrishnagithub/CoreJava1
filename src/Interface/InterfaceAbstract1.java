package Interface;
interface  Electronics{
	void cost();
	void features();
	static void print() {
		System.out.println("Electronics are manufacturing from hardware and software platform system");
	}
}
abstract class Mobile implements Electronics{
	public void memory() {
		System.out.println("mobile memory stored are 8gb or 16gb or 128gb or 256 gb");
	}
}
abstract class Laptop implements Electronics{
	public void memory() {
		System.out.println("laptop stored are 512 gb SSD");
	}
}
class Apple extends Mobile{
	public void cost() {
		System.out.println("apple cost is 1 lakhs ");
	}
	public void features() {
		System.out.println( "apple is  separate software  version from the difference of andriod  version ");
			}
	
}
class Oneplus extends Mobile{


	public void cost() {
		System.out.println("oneplus cost is 50k");
	}
	public void features() {
		System.out.println("oneplus is  only andriod version ");
	}
	
}
class Asus extends Laptop{
	public void cost() {
		System.out.println("Asus cost is 60k");
	}
	public void features() {
		System.out.println("Asus is only difference  window version and manfacturing from companyname");
	}
	
}
class Dell extends Laptop{
	public void cost() {
		System.out.println("Dell  cost is 50k");
	}
	public void features() {
		System.out.println(" dell is only difference  window version and manfacturing from companyname");
	}
	
}
public class InterfaceAbstract1 {

	public static void main(String[] args) {
		Mobile er;
		Electronics.print();
		er = new Apple();
		System.out.println("_________________");
		er.cost();
		er.features();
		er= new Oneplus();
		er.cost();
		er.features();
		System.out.println("<---------------------------->");
		Electronics.print();
		Laptop tr;
		tr = new Asus();
		tr.cost();
		tr.features();
		tr=new Dell();
		tr.cost();
		tr.features();
		 
	}

}
