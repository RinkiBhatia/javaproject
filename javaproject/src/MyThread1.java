
public class MyThread1 {

	public static void main(String[] args) {
		yahoo1 obj1=new yahoo1("Thread-A");
		obj1.start();
		yahoo1 obj2=new yahoo1("Thread-B");
		obj2.start();

	}

}
