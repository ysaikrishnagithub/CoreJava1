package practice;
  class CarSample<f> {
	  void cost(f a) {
		  System.out.println(a);
	  }
 }
public class GenericClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSample<String> x1= new CarSample<String>();
		     System.out.print("brand----");
			x1.cost("Jaguar");
		CarSample<Integer> x= new CarSample<Integer>();
			System.out.print("number----");
			x.cost(90);
			
			CarSample<Float> x2= new CarSample<Float>();
			System.out.print("length-------");
			x2.cost(2.5f);
			CarSample<Double> x3= new CarSample<Double>();
			System.out.print("height--------");
			x3.cost(1.75);
			
	}

}
