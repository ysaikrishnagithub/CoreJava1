package abstract_demo;

abstract class  Cars2{
  abstract  void cost() ;
   abstract void milage1();
	// TODO Auto-generated method stub
   	void start() {

   		System.out.println("Starts with a key");
   	}
	}
class Audi1 extends Cars2{
	void cost() {
		// TODO Auto-generated method stub
		System.out.println("audi1 cost is 60lakhs");
	}

	@Override
	void milage1() {
		// TODO Auto-generated method stub
		System.out.println("Audi1 milage is 15km");
	}
}
class Bmw1 extends Cars2{

	@Override
	void cost() {
		// TODO Auto-generated method stub
		System.out.println("Bmw1 cost is 45lakhs");
		
			}	
	

	@Override
	void milage1() {
		// TODO Auto-generated method stub
		System.out.println("Bmw1 milage is 20km");
	}
	
}

public  class Cars2_Abstract_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars2 j;
		
		System.out.println("_________");
		System.out.println("enter the collection of cars");
		
		j= new Audi1();
		j.start();
		j.cost();
		j.milage1();
		System.out.println("_________");
		j= new Bmw1();
		j.start();
		j.cost();
		j.milage1();
	}

}



