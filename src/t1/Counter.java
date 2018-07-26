package t1;

class Counter extends Thread
{
	long n=0;
	public void run()
	{
		while(n <= 5)
		{
			n=n+1;
			System.out.println(Thread.currentThread().getName()+"-"+n);	
		}
	}
}
