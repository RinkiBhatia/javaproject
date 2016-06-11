
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
