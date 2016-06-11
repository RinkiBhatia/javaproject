class x{
	public void getData1(){
		System.out.println("Class x>> getData1");
		
	}
}
final class y extends x{
	public void getData2(){
		System.out.println("Class y>> getData2");
		
	}
	
	
}
class z extends y
{public void getData3(){
	System.out.println("Class z>> getData3");
}
}

public class Rinki3 {

	public static void main(String[] args) {
		y obj=new y();
		obj.getData1();
		obj.getData2();
	z obj1=new z();
    obj1.getData3();

	}

}
