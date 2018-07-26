package t1;

class Thread5
{
	public static void main(String[] args) throws Exception
	{
		Counter obj1=new Counter();
		Counter obj2=new Counter();
		
		obj1.setPriority(1);
		obj2.setPriority(9);
		
		obj1.start();
		obj2.start();

		Thread.sleep(10000);

		obj1.stop();
		obj2.stop();
		Thread.sleep(2000);
		System.out.println();
		System.out.println(obj1.n);
		System.out.println(obj2.n);
	}
}

