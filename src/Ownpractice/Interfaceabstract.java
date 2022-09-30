package Ownpractice;
 interface  Vehicles{
	 void cost();
	 void milage();
}
 abstract class CarAuto implements Vehicles{
	public  void viper() {
		 System.out.println("it is useful to clean  the glass in raining");
	 }
 }
 abstract class Bikes implements Vehicles{
	public  void stand() {
		 System.out.println("stand is use ful of repairing section");
	 }
 }
 class Audi2d extends CarAuto{
	public void cost() {
		System.out.println("Audi2d cost is 70lakhs");
	}

	public void milage() {
		System.out.println("Audi2d milage is 20km");
	}
 }
 class Jaguar extends CarAuto{
	public void cost() {
		System.out.println("Bmw cost is 50lakhs");
	}
	public void milage() {
		System.out.println("Bmw milage is 10km");
	}
 }
 class Ninja  extends Bikes{
	public void cost() {
		System.out.println("Ninja cost is 2.5lakhs");
	}
	public void milage() {
		System.out.println("Ninja milage is 20km");
	} 
 }
 class Duke extends Bikes{
	public void cost() {
		System.out.println("Duke cost  is 1.5lakhs");
	}
	public void milage() {
		System.out.println("Duke milage is 36km");
	}
 }
public class Interfaceabstract {
	public static void main(String[] args) {
		CarAuto fd;
		fd= new  Jaguar();
		System.out.println("classic cars ");
		System.out.println(" ");
		fd.viper();
		 fd.cost();
		 fd.milage();
		 System.out.println("___________");
		 fd=new Audi2d();
		 fd.cost();
		 fd.milage();
		 Bikes ds;
		 System.out.println("<--------------->");
		 ds = new Duke();
		 System.out.println("Racing bikes");
		 System.out.println(" ");
		 ds.stand();
		 ds.cost();
		 ds.milage();
		 System.out.println("_______");
		 ds=new Ninja();
		 ds.cost();
		 ds.milage();
	}

}
