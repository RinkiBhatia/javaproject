class A{
	public int a=10;
	public static int b=15;
	public void getData()
	{
		System.out.println("Value of a is"+a);
		System.out.println("Value of b is"+b);
		
	}
}
public class staticuse {

	public static void main(String[] args) {
     A obj1=new A();
     obj1.getData();
     obj1.a=20;
     obj1.b=25;
     A obj2=new A();
     obj2.getData();
     obj1.getData();

	}

}
