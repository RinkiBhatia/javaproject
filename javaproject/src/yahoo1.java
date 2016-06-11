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

