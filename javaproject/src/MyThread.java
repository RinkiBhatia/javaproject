
public class MyThread {

	public static void main(String[] args) {
		System.out.println("MyThread::Good Morning>>1");
		try{
			Thread.sleep(6000);
			
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
        yahoo obj=new yahoo("My thread");
        obj.start();
        System.out.println("MyThread::Good Morning>>2");
        
	}

}
