package Method_Overriding;
class Car{
void cost() {
	   System.out.println("no cost");
}
void milage() {
	   System.out.println("no milage");
}
}
class Audi extends Car{
	   void cost() {
		   System.out.println("audi is 50lakhs");
	   }
	   void milage() {
		   System.out.println("audi is 15km");
	   }
}
class Bmw extends Car{
	   void cost() {
		   System.out.println("bmw is 40lakhs");
	   }
	   void milage() {
		   System.out.println("bmw is 30kms");
	   }
}
 public class Methodoverriding {
	public static void main(String[] args) {
		Car w = new Car();
          w.cost();
          w.milage();
          w= new Audi();
          w.cost();
          w.milage();
          w=new Bmw();
          w.cost();
          w.milage();
	}   
	

}

