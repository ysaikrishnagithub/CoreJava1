package nestedloop_demo;
interface parent{
	String name="stark";
}
interface child {
	String name="hulk";
}
abstract class Details implements parent,child{
        void Detail() {
        	System.out.println("averanges end game");
		}
        	
        }

class Inner extends Details{
	 public void inner1(){
		 super.Detail();
		System.out.println("parent ="+parent.name);
		System.out.println("child ="+child.name);
	}
	
}
public class NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Details d;
        d=new Inner();
       ((Inner) d).inner1();
        
      
         
	}

}
