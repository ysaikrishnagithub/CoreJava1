package OwnTheme;
import java.util.*;
    class Package{
	 static String company_name;
	 String package_name;
	int number;
	long Package_urlnumber;
	double distance;
	 Package(String package_name,int  number,long Package_urlnumber,String company_name,double distance){
		this.package_name=package_name;
		this.distance=distance;
		this.Package_urlnumber=Package_urlnumber;
		this.number=number;
		//this.company_name=company_name;
	 }
		 Package(String company_name) {
			 company_name=company_name;
		   
	}
    }
		 class Delivery extends Package{
			 int cash;
			 float Qr_code;
			Delivery(int cash,float Qr_code) {
				super("blackburry",30,2989556,"AMAZON", 234);
				this.cash=cash;
				this.Qr_code=(float)(66.5/this.cash);
				
			}
			 
		void  details () {
			System.out.println("this  ="+this);
			System.out.println("delivery company_name  ="+company_name);
			System.out.println("delivery package name="+package_name);
			System.out.println("delivery Package_urlnumber is ="+Package_urlnumber);
			System.out.println("delivery distance is ="+distance);
			System.out.println("delivery number of  is ="+number);
			System.out.println("delivery cash ="+cash);
			System.out.println("delivery Qr_code is="+Qr_code);
			
		
		}
    }
		
	 public class Courier {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter values");
		Delivery obj = new Delivery(123,3.4f);
		obj.details();
		
		
		
	}

}
