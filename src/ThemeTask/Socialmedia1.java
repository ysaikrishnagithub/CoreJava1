package ThemeTask;
class Develop{
	 void account() {
		 System.out.println("google account___name$");
	     }
	       void accountLogo(String name,String website) {
		  System.out.println("name = "+name+" and website= "+website);
		
	     }
	     String server() {
	    	 return "server";
	     }
          String html(int programing) {
        	  System.out.println("programing give = "+programing);
        	  return "html";
          }
}
public class Socialmedia1 {
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Develop dot = new Develop();
        dot.account();
        dot.accountLogo("hulk33", "www.google.com");
        System.out.println("sever on internet= "+dot.server());
        System.out.println("execution of google code= "+dot.html(100));
        
	}

}
