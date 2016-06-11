  interface HDFC_Account {
	public int getIrr();
	public String getAccountType();

}

 class HDFC_CurrentAccount {
	public int getIrr(){	
		return 5;
	}
		
	
   public String getAccountType(){
	   return "Current Account";
   }

}
 class HDFC_SavingAccount {
	public int getIrr(){	
		return 6;
	}
		
	
   public String getAccountType(){
	   return "Saving Account";
   }
	
}


public class HDFC {

	public static void main(String[] args) {
		HDFC_SavingAccount obj=new HDFC_SavingAccount();
		System.out.println("Account Type::"+obj.getAccountType());
		System.out.println("Account Type::"+obj.getIrr());
		HDFC_CurrentAccount obj1=new HDFC_CurrentAccount();
		System.out.println("Account Type::"+obj1.getAccountType());
		System.out.println("Account Type::"+obj1.getIrr());

	

	}

}
