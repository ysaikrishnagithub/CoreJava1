package practice;

public class ArithematicExceptionHandling {

	public static void main(String[] args) {
		int a=20;
		int b=2;
		System.out.println("variables added before the try/catch");
		try {
			System.out.println("div="+(a/b));
			System.out.println(" user not defind");
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			
		}
		System.out.println(" after the process ae.exception is ");
	}

}
