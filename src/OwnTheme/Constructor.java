package OwnTheme;
class Company{
    int eid ;
    double salary ;
    long ph_number;
    float taxes___;
     static String name;

    Company ( int eid , double salary,long ph_number,float taxes___,String name) {
      this.  eid = eid ;
      this.  salary	= salary;
      this.  ph_number=ph_number;
       this. taxes___= taxes___;
       this. name=name;
   }
   void show ( ) {
	   System.out.println("this ="+this);
        System.out.println ("Id = " + eid ) ;
        System.out.println ( "salary = " + salary ) ;
        System.out.println ( "number = " + ph_number) ;
        System.out.println ( "taxes = " + taxes___) ;
          System.out.println(  "name=   "+name);
   }
}
public class Constructor {

	public static void main(String[] args) {
	 Company prem=new Company(2022, 100000, 908764323, 5.6f, "virat");
	 prem.show();
	 System.out.println("_____________");
	 Company ktm = new Company(2023,200000,708965324,4.5f,"kohli");
	 ktm.show();
	}

}
