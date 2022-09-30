package Ownpractice;
import java.util.*;

interface Academy{
	void number();
	String participate();
	void captain(String select1);
	
}
  class Sports implements Academy {
	Scanner sc = new Scanner(System.in);	
	//private int selection;
	public void number() {
	System.out.println(" sports are no .of kits there");
	System.out.println("cricket");
	System.out.println("volley ball");
	}
	public String participate() {
		String selection =sc.nextLine();
		String select1 = selection.toUpperCase();
		return select1;
	}
	public void captain(String select1) {
		 switch(select1) {
		    case "CRICKET":
		    	System.out.println("ss bat kit- 40%off ");
		    	System.out.println("bas bat kit-30%off");
		    	break;
		    case "VOLLEYBALL":
		    	System.out.println(" vicky ball -50%off");
		    	System.out.println("sporty ball - 35%off");
		    }		
	}
	}	
public class StringInterface {
	public static void main(String[] args) {
		Academy s = new Sports();
		s.number();
		String g = s.participate();
		s.captain(g);
		

	}

}
