
public class MyThread2 {

	public static void main(String[] args) {
		Thread obj3=new Thread(new yahoo2());
		obj3.setName("Thread-A");
		obj3.start();
		Thread obj4=new Thread(new yahoo2());
		obj4.setName("Thread-B");
		obj4.start();
		

	}

}
