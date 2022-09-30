package ThemeTask;
class Student1{
	void name() {
		System.out.println("FOOTBALL");
	}
	void logo(String name,int number) {
		System.out.println("name ="+name+" number="+number);
		
	}
	String team() {
		return "team";
	
	}
	String cup(int wining) {
		System.out.println("wining="+wining);
		return "prize money is 10k";
	}
}
public class Method1 {

	public static void main(String[] args) {
	   Student1 pt=new Student1();
	   pt.name();
	   pt.logo("Ronaldo", 07);
	   System.out.println("portugal national football ="+pt.team());
	   System.out.println("UEFA nations league 2019 ="+pt.cup(100000));

	}

}
