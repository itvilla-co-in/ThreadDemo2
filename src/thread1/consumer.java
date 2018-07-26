package thread1;

import java.util.Queue;

public class consumer extends Thread
{
	private Queue<Integer> queue;
	private int maxsize;
	
	public consumer(Queue<Integer> queue,int maxsize,String name)
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
				
				while(queue.isEmpty())
				{
					
					try {
						System.out.println("there is nothing to consume waiting for producer");
						queue.wait();
					} catch (InterruptedException e) {
						// 
						e.printStackTrace();
					}//tyr catch end
		
					
				}//while queue.isempty end
				System.out.println("consuming value" + queue.remove());
				queue.notifyAll();
			}// sync queue end
			
		}//while true end
	}//run end
	
}
