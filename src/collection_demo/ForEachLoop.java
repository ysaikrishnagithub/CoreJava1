package collection_demo;
import java.util.*;
class Array{
	String hello[][]= new String[5][5];
    int a[][]=new int[5][5];
    int b[][]=new int[5][5];
    int c[][]=new int[5][5];
	Scanner d = new Scanner(System.in);
	void scan() {
		for(int i=0;i<=4;i++ ) {
			for(int j=0;j<=4;j++) {
				System.out.println("Array demo 2d elements");
				a [i][j]= d.nextInt();
			}
			
		}
	}
	/*void scan1() {
		for(int i=0;i<=4;i++ ) {
			for(int j=0;j<=4;j++) {
				a[i][j]= d.nextInt();
				System.out.println(""+a[i][j]);
			}
		}
	}*/
	void scan2() {
		for(int i=0;i<=4;i++ ) {
			for(int j=0;j<=4;j++) {
				b[i][j]= d.nextInt();
				System.out.println(""+b[i][j]);
			}
		}
		}
	
	/*void print() {
		for(String []s:hello) {
			for(String g:s) {
				System.out.print("  "+g+"  ");
			}
			System.out.println();
			
		}
		
	}*/
	void print1() {
		for(int i=0;i<=4;i++ ) {
			for(int j=0;j<=4;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}System.out.println();

}
		
	}
}
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Array d = new Array();
     d.scan();
     //d.print();
     //d.scan1();
     d.scan2();
     d.print1();
	}

}
