package t1;

public class Thread4 
{
	public static void main(String[] args) 
	{
		System.out.println("No of Active Threads = "+Thread.activeCount());
		Thread t=Thread.currentThread();
		System.out.println(t);
		
		MyThread1 mt=new MyThread1();
		mt.start();
		System.out.println("No of Active Threads = "+Thread.activeCount());
	}
}

