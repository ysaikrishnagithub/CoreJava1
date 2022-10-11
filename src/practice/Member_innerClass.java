package practice;
class University{
	void notification() {
		System.out.println("notification");
		System.out.println("pgcet exam date:08/02/2022");
	}
	class Department{
		void pretest() {
			System.out.println("government will be anounced");
		}		
	}
}

public class Member_innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University obj = new University();
		obj.notification();
		University.Department cse= obj.new Department();
		cse.pretest();
		}

}