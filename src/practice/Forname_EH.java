package practice;
class Exception{
	static {
		System.out.println("Exception static block");
	}

}
public class Forname_EH {

	public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Static method");
        Class.forName("Exception");
       
	}

}
