package OwnTheme;
interface Travelling{
	void charges();
	void protection();
	static void start() {
		System.out.println("travelling types ");
	}
}
abstract class publictravels implements Travelling{
	void facility() {
		System.out.println("publictravels are not convinent");
	}
}
abstract class privatetravels implements Travelling{
	void facility() {
		System.out.println("privatettravels are very convinent");
	}
}
class Rtc extends publictravels{
	public void charges() {
		System.out.println(" RTC travels  charges is very limited :hyd to spl charges =500$");
	}
	public void protection() {
		System.out.println("RTC travels protection  seats from girls perfer to special seats");
	}
	
}
class Bsr extends privatetravels{

	public void charges() {
		System.out.println("BSR travels charges is very cost :spl to hyd charges=750$");
	}
	public void protection() {
		System.out.println("BSR travels protection seats are not mandatory for boys (or) girls");
	}
}

public class InterfaceOwnTheme {

	public static void main(String[] args) {
		Travelling.start();
		publictravels tc;
		System.out.println("___________");
		System.out.println("  ");
		tc= new Rtc();
		tc.charges();
		tc.facility();
		tc.protection();
		System.out.println("<-------------------------->");
		Travelling.start();
		System.out.println("___________");
		privatetravels re;
		re= new Bsr();
		re.facility();
		re.charges();
		re.protection();
		
	}

}
