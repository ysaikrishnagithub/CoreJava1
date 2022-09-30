package practice;
import java.util.*;

class Demo{
	int d[][]= new int[3][3];
	 static Scanner sc = new Scanner(System.in);
	void start() {
	for(int i =0;i<d.length;i++) {
		for( int j=0;j<d.length;j++){
			System.out.println(" enter 2d array elements");
			d[i][j]=sc.nextInt();
		}
		
	}
	}
	void print() {
		for(int i =0;i<d.length;i++) {
			for( int j=0;j<d.length;j++){
				System.out.print(" "+d[i][j]);
		}
			System.out.println();
	}
	
	
	}
}
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo f = new Demo();
      f.start();
      f.print();
	}

}
