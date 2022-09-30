package practice;

public class NullPointerExceptionandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=2;
		String name=null;
		System.out.println("null pointer exception handling-1");
		try {
			System.out.println("div  = "+(a/b));
			System.out.println("length of null pointer= "+name.length());
		}
		catch(ArithmeticException r) {
			r.printStackTrace();
			
		}
		//catch(NullPointerException w) {
			//w.printStackTrace();
			
		//}
		finally {
			System.out.println("close the objects");
		}
		System.out.println("null pointer exception handling-4");
		System.out.println("null pointer exception handling-5");
		System.out.println("null pointer exception handling-6");
		

	}

}
