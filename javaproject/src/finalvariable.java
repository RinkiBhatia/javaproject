class data{
	private int a=10;
	private final int b=20;
	public void setdata(){
		a=15;
	
		
	}
	public void getdata(){
		System.out.println("the value of a :: "+a+ "the value of b :: "+b);
		
		
	}
}
public class finalvariable {

	public static void main(String[] args) {
		data obj=new data();
		obj.setdata();
		obj.getdata();
		

	}

}
