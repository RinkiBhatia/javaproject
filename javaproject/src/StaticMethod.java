 class Message {
	public void getMessage(){
		System.out.println("Jagte rho!!");
	}
		public static void getMessage1(){
			System.out.println("Hello!!");
		
	}

}

public class StaticMethod {

	public static void main(String[] args) {
		Message obj=new Message();
		obj.getMessage();
		Message.getMessage1();

	}

}
