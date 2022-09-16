package practice;
class Pt{
	String name;
	int numbers;
	float area;
	String team;
	static String captain;
	double logoNumber;
    char cup;
    short favrtNumber;
    long phNumber;
	
}

public class Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pt fav = new Pt();
       fav.team="INDIA";
       fav.name="Cricket";
       fav.numbers= 11;
       fav.area=150f;
       Pt.captain="DHONI";
       fav.logoNumber=7;
       fav.cup='2';
       fav.favrtNumber=33;
       fav.phNumber=91977454673l;
       
       System.out.println("my fvrt team is = "+fav.team);
       System.out.println("world wide game= "+fav.name);
       System.out.println("how many members are in team= "+fav.numbers);
       System.out.println("ground diameter = "+fav.area+"m");
       System.out.println("captain is = "+Pt.captain);
       System.out.println("dhoni logonumber is =  "+fav.logoNumber);
       System.out.println("world cup is =  "+fav.cup);
       System.out.println("my lucky number is = "+fav.favrtNumber);
       System.out.println("captain number = +"+fav.phNumber);
       
       
       
	}

}
