
class Outerclass{
	private int i=10;
	class InnerClass1{
		public InnerClass1(){
			System.out.println("Inner Class Constructor");
			
		}
		public void getInnerClass1Data(){
			System.out.println("Inner Class Calling and the value of i is "+i );
			
		}
	}
	static class InnerClass2{
		public InnerClass2(){
			System.out.println("Static Inner Class2 Constructor");
			}
		public void getInnerClass2Data(){
			System.out.println("Static Inner Class Calling ");
		}
	}
		
	public void getOuterClassData(){
		InnerClass2 obj1=new InnerClass2();
		obj1.getInnerClass2Data();
		InnerClass1 obj2=new InnerClass1();
		obj2.getInnerClass1Data();
		
	}
}

public class StaticClass1 {

	public static void main(String[] args) {
		
				Outerclass obj=new Outerclass();
				obj.getOuterClassData();
				Outerclass.InnerClass1 obj3=new Outerclass().new InnerClass1();
				obj3.getInnerClass1Data();
				Outerclass.InnerClass2 obj4=new Outerclass.InnerClass2();
				obj4.getInnerClass2Data();
		}

}
