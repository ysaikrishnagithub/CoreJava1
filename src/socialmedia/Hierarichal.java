package socialmedia;
class Cars{
	void specifications() {
		System.out.println("Anti-Lock Braking System.");
		System.out.println("Electronic Brake Distribution(EBD),auto gear systems");
		System.out.println("Airbags,sunproof,topend");
	}
}
class Ferrari extends Cars{
	void model() {
		System.out.println("Ferrari has classical one");
	}
}
class volo extends Cars{
	void model() {
		System.out.println("volo  has triping adventure");
	}
}
public class Hierarichal {
	public static void main(String []args) {
	System.out.println("The specifications of Ferrari Car");
	
	Ferrari b = new Ferrari();
	b.specifications();
	b.model();
	
	System.out.println("------------");
	
	System.out.println("The specifications of volo  Car");
	volo  j = new volo ();
	j.specifications();
	j.model();

}
}