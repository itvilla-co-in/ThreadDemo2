package t1;

public class Thread2 
{
	public static void main(String[] args) 
	{
		Thread t=Thread.currentThread();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{
			Thread.sleep(2000);
			}
			catch(Exception e){}
		}
	}
}
