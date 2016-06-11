class yahoo1 extends Thread{
public yahoo1(String value){
	super(value);
	
}
public void run(){
	try{
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread()+"::"+i);
			Thread.sleep(6000);
		}}
		catch(InterruptedException e)
		{e.printStackTrace();
		
		}
	}

}
public class MyThread1 {

	public static void main(String[] args) {

		yahoo1 obj1=new yahoo1("Thread-A");
		obj1.start();
		yahoo1 obj2=new yahoo1("Thread-B");
		obj2.start();

	}

	}


