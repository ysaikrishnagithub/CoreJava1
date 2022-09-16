package socialmedia;

class Game1 {
	Game1(int member){
		System.out.println(" volleyball conducted by total members are in"+member);
		
	}
}
class Sport1 extends Game1 {
	Sport1(int selection){	
	super(10);
	System.out.println("only select for ="+selection);	
}
public static void main(String[] args) {
	Sport1 Pt = new Sport1(7);
   
	}
}
	
