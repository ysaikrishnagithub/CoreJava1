package practice;

public class Encapulcationdemo {
	int Eid;
	String name;
	int Marks;
	public Encapulcationdemo(int eid, String name, int marks) {
		super();
		Eid = eid;
		this.name = name;
		Marks = marks;
	}


	public int getEid() {
		return Eid;
	}


	public void setEid(int eid) {
		Eid = eid;
	}


	public  String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return Marks;
	}


	public void setMarks(int marks) {
		Marks = marks;
	}


	public static void main(String[] args) {
		Encapulcationdemo  d= new Encapulcationdemo (07, "naruto",999 );
		System.out.println("college student identity");
		System.out.println("eid is ->"+d.getEid());
		System.out.println("marks  is-> "+d.getMarks());
		System.out.println("name is ->"+d.getName());
		
		

	}

}
