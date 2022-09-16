package practice;
 class Bank{
	 void form() {
		 System.out.println("detailed age__name");
	 }
	 void submitProof(String  id,String address) {
		 System.out.println("id="+id+" and address= "+address);
	 }
	 String passBook() {
		 return "passbook";
		 
	 }
	 String deposit(int amount) {
		 System.out.println("amount given ="+amount);
		 return "deposited";
	 }
 }
public class Method {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bank hdfc = new Bank();
       hdfc.form();
       hdfc.submitProof("PAN:DFJ23455D", "AADHAR:0987992091290");
       System.out.println("bank given = "+hdfc.passBook());
       System.out.println("amount is given ="+hdfc.deposit(30000));
	}

}
