package TNS;

public class Ex2 extends Thread {
	int time;
	String word;
	
	public Ex2(int time,String word)
	{
	this.time=time;
	this.word=word;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		try
		{
			Thread.sleep(time);
		}
		catch(Exception e)
		{
		
		}
		System.out.println(word + i);
		}
	}
}
