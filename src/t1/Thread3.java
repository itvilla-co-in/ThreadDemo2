package t1;

public class Thread3 
{
   public static void main(String[] args) 
   {
	   System.out.println("No of Active Threads = "+Thread.activeCount());
	   Thread t=Thread.currentThread();
	   System.out.println(t);
	   
	   MyThread mt=new MyThread();
	   Thread ct=new Thread(mt);	   
	   ct.start();	   
	   System.out.println("No of Active Threads = "+Thread.activeCount());
   }
}
