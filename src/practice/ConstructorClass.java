package practice;
 class Faculty{
	 int hallticket_number;
	 static String name;
	 long no_of_persons;
	 Faculty(){
		 hallticket_number=2022345;
		 name="sai";
		 no_of_persons= 300;
		 
	 }
	 void run() {
		 System.out.println("hall ticket_number= "+hallticket_number);
		 System.out.println("name= "+name);
		 System.out.println("no_of_persons= "+no_of_persons);
	 }
 }
public class ConstructorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty mng = new Faculty();
		mng.run();
	}

}
