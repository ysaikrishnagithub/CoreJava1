package OwnTheme;
class Sports1{
	void players(){
		System.out.println("No Players");
	}
	void duration() {
		System.out.println("No Duration");
	}
	void Start() {
		System.out.println("\nStart the match ");
	}
}
class Golf extends Sports1{
	void players(){
		System.out.println("Golf has 12 players");
	}
	void duration() {
		System.out.println("Golf match duration 40 minutes");
	}
}
class Pubg extends Sports1{
	void players(){
		System.out.println("pubg has 100 players");
	}
	void duration() {
		System.out.println("pubg match duration is  1hr");
	}
}
class SportsAcademy{
	static Sports1 getSports(String SportsName){
		if(SportsName.equals("Golf")) 
			return new Golf();
		else if(SportsName.equals("Pubg"))
			return new Pubg();
		else
		return null;
		}
	}
public class FactorMethodCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sports1 f =SportsAcademy.getSports("Golf");
     f.Start();
     f.players();
     f.duration();
     System.out.println("======================================>");
    SportsAcademy f1= new SportsAcademy ();
    Sports1 r = f1.getSports("Pubg");
    r.Start();
    r.players();
    r.duration();
     
	}

}
