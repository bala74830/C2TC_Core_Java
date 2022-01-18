package TNS;
class implclass implements i1,i2
{
	
	private static Ex obj;

	public static void main (String [] args)
	{
	obj.set(100,200);
	obj.disp();
	obj.incr();
	obj.disp();
	}

public class Ex
{
	int p=10;
	int q=20;
	public void set(int x,int y)
	{
	p=x;
	q=y;
	}
	void incr()
	{
	p++;
	}
	public void disp()
	{
	System.out.println(p);
	System.out.println(q);
	}
}
}
