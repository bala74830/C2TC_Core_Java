package TNS;

public class Threaddemo1 {

	public static void main(String[] args) {
		Ex2 obj1=new Ex2(3000,"HELLO CLASS");
		Ex2 obj2=new Ex2(3000,"WELCOME TO TNS");
		
		obj1.start();
		obj2.start();
		try
		{
			obj1.join();
			obj2.join();
		}
		catch(Exception e)
		{
			
		}

	}

}
