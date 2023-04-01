
class ThreadMy implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("value of i is "+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}

public class Thread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadMy mt = new ThreadMy();
		
		Thread t = new Thread(mt);
		
		t.start();
	}

}
