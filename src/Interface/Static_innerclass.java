package Interface;
class UniversityJntk{
	static void notification() {
		
		System.out.println("notification");
		System.out.println("pgcet exam date:19/09/2022");
	}
	static class Department{
		static void pretest() {
			System.out.println("government will be anounced");
		}	
		void councelling() {
			System.out.println(" your qualify in pgcet after about that  councelling");
		}
		
	}
}
public class Static_innerclass {
	public static  void main(String args[]) {
		
		UniversityJntk.notification();
		System.out.println("___________");
		UniversityJntk.Department.pretest();
		System.out.println("___________");
		UniversityJntk.Department h = new UniversityJntk.Department();
		h.councelling();
	}

}
