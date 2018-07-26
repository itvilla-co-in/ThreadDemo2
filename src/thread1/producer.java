package thread1;

import java.util.Queue;
import java.util.Random;

public class producer extends Thread 
{

	private Queue<Integer> queue;
	private int maxsize;
	
	public producer(Queue<Integer> queue,int maxsize,String name)
	{
		super(name);
		this.queue=queue;
		this.maxsize=maxsize;
	}
	
	public void run()
	{
		
		while(true)
		{
		synchronized (queue) 
		{
			
		
			while(queue.size() == maxsize)
				{
				
					
					try {
						System.out.println("Producer thread is full waiting for consumer to consme");
						queue.wait();
					} catch (InterruptedException e) {
						// 
						e.printStackTrace();
					}//tyr catch end
				}//while q size end
		
			Random random = new Random();
			int i = random.nextInt();
			System.out.println("Producer has prodcued value for consuption " + i);
			queue.add(i);
			queue.notifyAll();
		}// queue end
		}//while ture end
		}// run end
}//class end
