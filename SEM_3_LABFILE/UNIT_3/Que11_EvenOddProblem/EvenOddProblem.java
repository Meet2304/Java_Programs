package SEM_3_LABFILE.UNIT_3.Que11_EvenOddProblem;

class NumberPrinting
{
	boolean isOdd= false;
	public synchronized void printOdd(int i)
	{
		while(isOdd)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Odd :" + i);
		isOdd =true;
		notify();	
	}
	public synchronized void printEven(int i)
	{
		while(!isOdd)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Even :" + i);
		isOdd =false;
		notify();	
	}
}
class OddThread extends Thread 
{
	NumberPrinting n;
	OddThread(NumberPrinting n)
	{
		this.n = n;
	}
	public void run()
	{
		for(int i=1;i<=20;i=i+2)
		{
			n.printOdd(i);
			try
			{
				Thread.sleep(1000);	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class EvenThread extends Thread 
{
	NumberPrinting n;
	EvenThread(NumberPrinting n)
	{
		this.n = n;
	}
	public void run()
	{
		for(int i=2;i<=20;i=i+2)
		{
			n.printEven(i);
			try
			{
				Thread.sleep(1000);	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class InterThreadCommunicationAPI
{
	public static void main(String[] args)
	{
		NumberPrinting n = new NumberPrinting();
		OddThread o1 = new OddThread(n);
		EvenThread e1 = new EvenThread(n);
		e1.start();
		o1.start();
	}
}

