class MyThread2 extends Thread
{	
	@Override
	public void start()
	{
		super.start();
		System.out.println("start method called");
	}
	
	@Override
	public void run()
	{
		System.out.println("No arg run method");
	}
	
}

public class Thread2
{
	public static void main(String[] args)
	{
		MyThread2 mt = new MyThread2();
		mt.start();
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread");
		}
	}
}
