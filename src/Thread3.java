import java.sql.*;

class MyThreadss extends Thread
{
	@Override
	public void run()
	{
			try
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("I am a sleeping thread "+i);
					//Thread.sleep(3000);
				}
			}
			catch (Exception e)
			{
				System.out.println("I got interrupted");
			}
	}
}


public class Thread3
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThreadss mt = new MyThreadss();
		mt.start();
		
		mt.interrupt();
		
		System.out.println("End of main thread");
	}
}
