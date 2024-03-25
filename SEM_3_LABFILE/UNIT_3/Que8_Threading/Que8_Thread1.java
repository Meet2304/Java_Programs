package SEM_3_LABFILE.UNIT_3.Que7_Threading;
class ChildThread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<250; i++)
		{
			System.out.println("Welcome From: " + Thread.currentThread().getName() +" "+i); 
		}
	}
}
class ChildThread2 implements Runnable
{
	public void run()
	{
		for(int i=250; i<=500; i++)
		{
			System.out.println("Greetings From: " + Thread.currentThread().getName() + " "+i); 
		}
	}
}
class Thread1 
{	
    	public static void main(String[] args) 
	{
        	for (int i = 501; i <= 700; i++) 
		{
            		System.out.println("Main Thread: " + i);
        	}
        	ChildThread1 thread1 = new ChildThread1();
		//thread1.setName("CHILDTHREAD1");
        	thread1.start();
        	Thread thread2 = new Thread(new ChildThread2());
		thread2.setName("CHILDTHREAD2");

        	thread2.start();
    	}
}

