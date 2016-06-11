

class Outerclass1{
	public void getData(){
	
		
		 class Inner{
			//public void Innerdata();
			public void Innercall(){
				System.out.println("Inner abstract class");
			}
		}
		 class inner1 extends Inner{
			//public void Innerdata(){
				//System.out.println("The value of i is "+i);
			//}
			public void inner1call(){
				System.out.println(" child class of inner");
				
			}
		}
	
	
		class inner3{
			//public void Innerdata(){
				//System.out.println("The value of i is "+i);
			//}
		
			public void inner3call(){
				System.out.println("innerclass3 method");
				inner1 obj =new inner1();
				obj.Innercall();
				obj.inner1call();
			}
		
		}	
}
}
		
	

		class classinmethod {

public static void main(String[] args){
Outerclass1 obj1=new Outerclass1();
obj1.getData();

}
}