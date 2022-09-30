package practice;
class Electronics{
	
	void power() {
		System.out.println("voltage");
	}
	void brand() {
		System.out.println("company");
	}
	
}
class Mac extends Electronics{
	void cost() {
		System.out.println("Mac is 50k");
	}
	void gaming() {
		System.out.println("Mac is awesome one");
	}
}
class Oneplus extends Mac{
	void cost1() {
		System.out.println("oneplus is 40k");
	}
	void gaming1 () {
		System.out.println("oneplus is excellent");
	}
	
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Oneplus d = new Oneplus();
		 d.power();
		 d.brand();
		 d.cost();
		 d.gaming();
		 d.cost1();
		 d.gaming1();
	}

}
