package t1;

class MyThread implements Runnable
{
  public void run()
  {
	  Thread t=Thread.currentThread();
	  System.out.println(t);
  }
}