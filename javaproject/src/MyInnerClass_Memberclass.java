

class outer {
private int i=10;
class InnerClass1{
	public InnerClass1(){
		System.out.println("Inner Class Constructor;");
		
	}
	public void getInnerClass1Data(){
		System.out.println("Inner Class calling and value of i is "+i);
		
	}
}
public void getOuterClassData(){
	System.out.println("Outer Class calling");
	InnerClass1 obj=new InnerClass1();
	obj.getInnerClass1Data();
}
}

public class MyInnerClass_Memberclass {

	public static void main(String[] args) {
		outer obj1=new outer();
		obj1.getOuterClassData();
		outer.InnerClass1 obj2=new outer().new InnerClass1();
		obj2.getInnerClass1Data();

	}

}
