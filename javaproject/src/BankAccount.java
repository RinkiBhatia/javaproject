
abstract class account {
	abstract String getAccountType();
	private int irr=4;
	public int getIrr(){
		return irr;
	
	}
}
	 class currentaccount extends account{
		 String getAccountType(){
			return "Current account";
			
			
		}

	}

class savingaccount extends account{
  String getAccountType(){
	return "Saving account";
	
	
}

}
public class BankAccount {

	public static void main(String[] args) {
		account myaccount=new savingaccount();
		System.out.println("Account Type::"+myaccount.getAccountType());
		System.out.println("Account Interest rate::"+myaccount.getIrr());
		myaccount=new currentaccount();
		System.out.println("Account Type::"+myaccount.getAccountType());
		System.out.println("Account Interest rate::"+myaccount.getIrr());	

	}

}
