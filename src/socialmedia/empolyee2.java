package socialmedia;
class Employee1{
	int employee_id ;
	double employee_salary ;
	
	Employee1 () {
	    employee_id = 2023;
	    employee_salary = 65000;
	}
	void show() {
	    System.out.println ("Id	= "+employee_id);
	    System.out.println ("salary	= "+employee_salary);
	}
}
public class empolyee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 shiva = new Employee1();
		shiva.show();
		
		System.out.println("________________");
		
		Employee1 peace = new Employee1();
		peace .show();
	}

}
