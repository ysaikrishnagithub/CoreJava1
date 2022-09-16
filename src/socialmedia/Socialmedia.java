package socialmedia;

class OnlineMedia{
	String accountName;
    int pin;
    String accountLogo;
    static String founder;
    float square;
    double internet;
    char link;
    short websitenumber;
    long number;
 
}
  public class Socialmedia {
	
	  public static void main(String[] args) {
		OnlineMedia web =new OnlineMedia();
		web.accountName="mr46";
		web.pin=3333;
		web.accountLogo="google";
		OnlineMedia.founder ="sundarpichai";
		web.square=200f;
		web.internet= 100;
		web.link='h';
		web.websitenumber=56;
		web.number=1246789891223l;
		
		
		
		System.out.println("accountName is = " +web.accountName);
		System.out.println("pin is = "+web.pin);
		System.out.println("accountlogo is = " +web.accountLogo);
		System.out.println("google founder is = "+OnlineMedia.founder);
		System.out.println("google server is = "+web.internet+"mb");
		System.out.println("around is = "+web.square);
		System.out.println("google  is = "+web.websitenumber);
		System.out.println("google is = "+web.link);
		System.out.println("google dial is = "+web.number);


		
		
		
		
		
		
		
	}

}
 
