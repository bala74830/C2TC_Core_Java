package TNS;
public class wrapperclassdemo
{
public static void main (String args[])
{
//Unboxing
Integer i=new Integer(10);
System.out.println(i);;
int b=i.intValue();
System.out.println(b);

//autoboxing
int a=100;
Integer i1=a;
System.out.println(i1);
Character ch='a';
char c=ch;
}
}