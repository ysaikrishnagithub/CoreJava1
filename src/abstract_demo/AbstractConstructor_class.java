package abstract_demo;
import java.util.*;
abstract class Paper{
	int a;
	String area;
	abstract void name();
	Paper( int a,String area){
	}
	abstract void start();
}
	class Cotton extends Paper{
		Cotton (int a,String area  ){
			super(a,area);
			System.out.println("enter radius");
			System.out.println("area of circle= "+((3.141*a*a)));
			
		}
			void name() {
				System.out.println("sakshi");
			
		}
			@Override
			void start() {
				// TODO Auto-generated method stub
				System.out.println("new paper");
			}	
			}
public class AbstractConstructor_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter paper");
		System.out.println("enter a value");
		Paper df;
		df=new Cotton(50,"vizag");
		df.name();
		df.start();
		
	}
}