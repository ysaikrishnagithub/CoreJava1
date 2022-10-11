package exceptionhandling_demo;
import java.lang.Exception;

public class Throw_and_Throws_Exception {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
         int x=17;
         if(x>18) {
        	 System.out.println("eligible for voting");
         }
         else {
        	  throw new Exception("not eligible for voting");
         }
	}

}
