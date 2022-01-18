package TNS;
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum is"+(a+b));
		Main obj =new Main();
		Sysout(obj.getClass());
		Sysout(obj.hashcode());
	}

	private Class<? extends Main> hashcode() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void Sysout(Class<? extends Main> class1) {
		// TODO Auto-generated method stub
		
	}
}