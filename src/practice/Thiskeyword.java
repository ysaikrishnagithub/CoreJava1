package practice;
 class google{
	 google(String name){
	
	 System.out.println("google search ="+name);
 }
 }
	 class Git extends google{
		 Git(String name){
			 super("zoom");
			 System.out.println(" company is ="+name);
			 
		 }
	 }
 
public class Thiskeyword {
	

	public static void main(String[] args) {
		Git otp = new Git(" mac");
	}

}
