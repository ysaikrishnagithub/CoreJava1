package practice;
import java.util.*;
public class Array_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new  int [6];
		Scanner sc = new Scanner(System.in);
		for( int i=1;i<=5;i++) {
			System.out.println("enter the  array elements ");
			a[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i =1;i<=5;i++) {
			sum = sum +a[i];
			System.out.println("a["+i+"]="+a[i]);
			
			
		}
		System.out.println("sum="+sum);
		
		
	}

}
