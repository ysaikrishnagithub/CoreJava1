package practice;

public class Nestedloop {

	public static void main(String[] args) {
		int k=1;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				 if(k%2==0) {
					 System.out.print("0"); 
				 }
				 else {
					 System.out.print("1");
					
				 }
				 k++;
			 }
			 System.out.println( );
			 
		 }
		System.out.println(" __________________");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
				
			}
			System.out.println();
			
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("__________");
		
		for(int i=5;i<=1;i++) {
			for(int j=5;j<i;j--) {
				System.out.print(j);
			}
			System.out.println();
	}
		System.out.println("___________");
		
		for( int i=1;i<5;i++) {
			for(int j=5;j<i;j--) {
				System.out.print(i);
				
			}
			System.out.println();
			
		}

}
}
