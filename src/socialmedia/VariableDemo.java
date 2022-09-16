package practice;
class Student{
	int id;
	double marks;
	static String college;
	
	
}
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student rahul=new Student();
       rahul.id= 123454;
       rahul.marks=996;
       Student.college="oxford";
       
       System.out.println("id is  = "+rahul.id);
       System.out.println("marks is = "+rahul.marks);
       System.out.println("college name = "+Student.college);
       
       Student shiva =new Student();
       System.out.println("id is  = "+shiva.id);
       System.out.println("marks is = "+shiva.marks);
       System.out.println("college name = "+Student.college);
       
       
       
	}

}
