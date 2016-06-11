class Share{
	public synchronized void getData(String threadName){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(5000);
				}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(threadName+"::"+i);
		}
	}
}
class MyThread5 extends Thread{
	private Share share;
	public MyThread5(Share shareObj,String pThreadName){
		super(pThreadName);
		this.share=shareObj;
		
	}
	public void run(){
		share.getData(Thread.currentThread().getName());
	}
}
public class Sharemain {

	public static void main(String[] args) {
	Share shareObject=new Share();
	MyThread5 obj1=new MyThread5(shareObject,"Thread-A");
	obj1.start();
	MyThread5 obj2=new MyThread5(shareObject,"Thread-B");
	obj2.start();
	

	}

}
