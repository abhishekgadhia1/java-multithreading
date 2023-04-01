
class Company
{
	int n;
	
	boolean b = false;
	
	synchronized public void produce_item(int n) throws InterruptedException
	{
		if(b)
		{
			wait();
		}
		this.n=n;
		System.out.println("Produced : "+this.n);
		b=true;
		notify();
	}
	
	synchronized public int consume_item() throws InterruptedException
	{
		if(!b)
		{
			wait();
		}
		System.out.println("Consumed : "+this.n);
		b=false;
		notify();
		return n;
		
	}
}

