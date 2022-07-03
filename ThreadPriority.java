//Thread Priority Assignment 
public class ThreadPriority extends Thread{ 
	public void mainclassrun(){  
		  for(int i=1;i<2;i++){  
		    try{
		    		Thread.sleep(4000);  //milliseconds
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e); 
		    	System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  } 
		}
	}
	
 @Override
	public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  //name of the thread
	   System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  
	   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState()); // prints the state of the running thread 
	   System.out.println("The thread group is:" + Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();

		t1.setName("T1 Thread");
		t2.setName("T2 Thread");
		t3.setName("T3 Thread");

		t1.setPriority(Thread.MAX_PRIORITY);  
	  	t2.setPriority(Thread.NORM_PRIORITY);  
	  	t3.setPriority(Thread.NORM_PRIORITY); 
	  
	  	t3.setDaemon(true); 
	  

		t1.start();
		t2.start();
		t3.start();
	}
}
