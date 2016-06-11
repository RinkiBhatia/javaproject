 class yahoo2 implements Runnable{
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


