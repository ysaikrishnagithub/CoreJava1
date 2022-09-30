package ThemeTask;
interface SocialMedia{
	void purpose();
	void users();
}
abstract class Linkdln implements SocialMedia{
	 public void jobprofile() {
		 System.out.println("search for job in companies official website");
	 }
}
abstract class Instagram implements SocialMedia{
	void enterainment() {
		System.out.println("cinema field industry");
	}
}
class Infosys extends Linkdln{
	public void purpose() { 
		System.out.println("Infosys is MNC company from IT corporatation field  they giving software jobs");
	}
	public void users() {
		System.out.println("Infosys users are based on the country websites ");
	}
	
} 
class  Shows extends Instagram{ 
	public void purpose() {
		System.out.println("comedy videos  is  cinema  field industry");
	}
	public void users() {
		System.out.println(" reels user are based on the enterainment");
		
	}
	
}
public class SocialMediaInterface {

	public static void main(String[] args) {
		Linkdln jl;
		System.out.println("social media platforms");
		System.out.println(" ");
		jl = new Infosys();
		jl.purpose();
		jl.users();
		System.out.println("______________");
		Instagram df;
		df= new Shows();
		df.purpose();
		df.users();
		
	}

}
