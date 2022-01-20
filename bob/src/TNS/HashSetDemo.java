package TNS;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo
{
public static void main(String args[])
{
HashSet<String> hs=new HashSet<String>();//can remove string and also use treeset to sort it
hs.add("Hash");
hs.add("Set");
hs.add("Demo");
hs.add("Demo");

Iterator i=hs.iterator();
while(i.hasNext())
{
Object o=i.next();
System.out.println(o);
}
}
}