class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child thread");
		}
	}
}

public class Thread1
{
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread");
		}
	}
}
