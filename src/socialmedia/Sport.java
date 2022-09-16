package practice;
import java.util.*;
 class Tournament{
	 void day(int a,int b) {
		 System.out.println("remaining teams ="+(a-b));
	 }
	 void day(String e,String d) {
		 System.out.println("final two teams is = "+e+" vs " +d);
		 
		 }
	 String team() {
		 return "team";
	 }
	 String fee(int amount) {
		 System.out.println("entry fees = "+amount);
		 return "15000";
	 }
 }
public class Sport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner df =new Scanner(System.in);
		System.out.println("cricket tournament  attended teams and  disqualifed teams");
       Tournament sakshi=new Tournament ();
         sakshi.day(df.nextInt(),df.nextInt() );
         System.out.println("remaining teams names");
         sakshi.day(df.next(), df.next());
         System.out.println("conduct by  deserteagle "+sakshi.team());
         System.out.println("wining prize ="+sakshi.fee(2000));
	}

}
