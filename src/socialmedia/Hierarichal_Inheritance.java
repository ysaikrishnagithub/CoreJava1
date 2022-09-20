package socialmedia;

import java.util.Scanner;

class Collage{
	int a;
	Scanner sc = new Scanner(System.in);
	 void start () {
		 System.out.println("enter the students");
		 a = sc.nextInt();
	 }
	 void ba() {
		 System.out.println("no.of students in collage"+a);
	 }
}
class Management extends Collage{
	int b;
	 void attend() {
		 b = sc.nextInt();
	 }
	 void bb() {
		 System.out.println("student attended is "+b);

	 }
	 void absent() {
		System.out.println("student absent  = " +(a-b));
		
	 }	 
}
 class Faculty1 extends Collage{
	 int d;
	 void rec() {
		 d=sc.nextInt();
	 }
	 void bc() {
		 System.out.println("no. of facultys in collage  "+d);
		
	 }
	 void cd() {
		 System.out.println("total member in collage = "+(a+d));
		
	 }
}
public class Hierarichal_Inheritance {

	public static void main(String[] args) {

		Management vfd=new Management();
		System.out.println("College");
		vfd.start();
		vfd.ba();
		vfd.attend();
		vfd.bb();
		vfd.absent();
		System.out.println("___________");
		Faculty1 vfd1 =new Faculty1 ();
		vfd1.start();
		vfd1.rec();
		vfd1.bc();
		vfd1.cd();
		
	}
}
