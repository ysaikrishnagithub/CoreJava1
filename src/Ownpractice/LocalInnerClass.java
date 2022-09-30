package Ownpractice;
class InfosysCompany{
	void recruitment() {
		System.out.println("notification");
		System.out.println("Infosys recruitment fresher from start/end of dates:5/09/22 to 30/09/22");
	class Hr{
		void commskills() {
			System.out.println("recruitment  yes or not based upon person skills ");
		}
	}
	Hr d = new Hr();
	d.commskills();
	}
}
public class LocalInnerClass {
	public static void main(String[] args) {
		InfosysCompany obj = new InfosysCompany();
		obj.recruitment();
	

	}

}
