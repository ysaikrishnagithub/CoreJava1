package socialmedia;
class Sports1{
	void players(){
		System.out.println("No Players");
	}
	void duration() {
		System.out.println("No Duration");
	}
}
class Golf extends Sports1{
	void players(){
		System.out.println("Golf has 12 players");
	}
	void duration() {
		System.out.println("Golf match is 40 minutes");
	}
}
class Pubg extends Sports1{
	void players(){
		System.out.println("pubg has 100 players");
	}
	void duration() {
		System.out.println("pubg match is  1hr");
	}
}
public class MethodOverridingTheme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports1 s = new Sports1();
		s.players();
		s.duration();
		System.out.println("----------");
		s = new Golf();
		s.players();
		s.duration();
		System.out.println("----------");
		s = new Pubg();
		s.players();
		s.duration();
	}

}
