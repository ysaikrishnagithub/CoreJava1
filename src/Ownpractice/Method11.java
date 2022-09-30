package Ownpractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Method11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1= new Patient("p1",20,"corona",17000);
		Patient p2= new Patient("p2",30,"fever",19000);
		Patient p3= new Patient("p3",40,"corona",8000);
		Patient p4= new Patient("p4",50,"corona",12000);
		List<Patient> Patients = Arrays.asList(p1,p2,p3,p4);
		Iterator<Patient> o = Patients.iterator();
		while(o.hasNext()) {
			
			System.out.println(o.next());
			
		}
		
		
	}

}
