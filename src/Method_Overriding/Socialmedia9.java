package Method_Overriding;
 class Server{
	 void internet() {
		 System.out.println("no internet");
	 }
	 void code() {
		 System.out.println("no code");
	 }
 }
 class Website extends Server{
	 void internet() {
		 System.out.println("execution in programining");
	 }
	 void code() {
		System.out.println("website code"); 
	 }
	 
 }
  class  Logo extends Server{
	 void internet() {
		 System.out.println("how much mbps ");
	 }
	 void code() {
		 System.out.println("account from the logo ");
	 }
 }
public class Socialmedia9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Server s = new Server();
         System.out.println("social network is  ");
         System.out.println("____________");
         s.internet();
         s.code();
         s= new Website();
         System.out.println("____________");
         s.internet();
         s.code();
         s= new Logo();
         System.out.println("____________");
         s.internet();
         s.code();
         
         
	}

}
