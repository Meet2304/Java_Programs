package SEM_3_LABFILE.UNIT_3.Que8_MultiplicationThread;

class ChildThread1 extends Thread {
    	int n;
    	public ChildThread1(int n) {
        	this.n = n;
    	}
    	public void run() {
        	for (int i = 1; i <= 10; i++) {
            		System.out.println("ChildThread1: " + n + " x " + i + " = " + (n * i));
            		try {
                		Thread.sleep(500); // Sleep for 0.5 seconds
            		} 
			catch (Exception e) {
                		e.printStackTrace();
            		}
        	}}
}

class ChildThread2 extends Thread {
    	int n;
    	Thread waitThread;
    	public ChildThread2(int n, Thread waitThread) {
        	this.n = n;
        	this.waitThread = waitThread;
    	}
    	public void run() {
        	try {
            		waitThread.join(); // Wait for childThread1 to complete
        	} 
		catch (Exception e) {
            		e.printStackTrace();
        	}
        	for (int i = 1; i <= 10; i++) {
            		System.out.println("ChildThread2: " + n + " x " + i + " = " + (n * i));
        	}}
}

class Thread2 {
    	public static void main(String[] args) {
        	int n1 = 3;
        	int n2 = 5;
        	int n3 = 7;
        	ChildThread1 thread1 = new ChildThread1(n1);
        	ChildThread2 thread2 = new ChildThread2(n2, thread1);
        	thread1.start();
        	thread2.start();
        	for (int i = 1; i <= 10; i++) 
		{
            		System.out.println("MainThread: " + n3 + " x " + i + " = " + (n3 * i));
        	}
    	}
}

