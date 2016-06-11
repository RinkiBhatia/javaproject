
public class hp {

	public static void main(String[] args) {
	account myaccount=new savingaccount();
	System.out.println("Account Type::"+myaccount.getAccountType());
	System.out.println("Account Interest rate::"+myaccount.getIrr());
	myaccount=new currentaccount();
	System.out.println("Account Type::"+myaccount.getAccountType());
	System.out.println("Account Interest rate::"+myaccount.getIrr());


	}

}
