package t1;

public class Thread1
{
 public static void main(String[] args) 
 {
	 int n=Thread.activeCount(); 
	 System.out.println("No of active threads = "+n);
	 
	 Thread t=Thread.currentThread();
	 System.out.println(t);
	 
	 System.out.println(t.getName());
	 System.out.println(t.getPriority());
	 
	 t.setName("shivank");
	 t.setPriority(10);
	 System.out.println(t);
 }
}

