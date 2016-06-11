
public class trycatch {

	public static void main(String[] args) {
	int number=0;
	try{
		number=9/0;
		
	}
catch(ArithmeticException exception){
	System.out.println("Exception::"+exception);

	}
	finally{
	System.out.println("Hurraaaah");
	}
	System.out.println("Result::"+number);
	}

}
