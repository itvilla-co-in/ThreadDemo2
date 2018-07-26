package t1;

class MyThread1 extends Thread
{
  public void run()
  {
	  Thread t=Thread.currentThread();
	  System.out.println(t);
  }
}
