package Thread;

public class MultiThreadTest extends Thread
{
	public void run() 
	{
		for(int i=0;i<=5;i++) 
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		MultiThreadTest m=new MultiThreadTest();
		m.start();
	}

}
