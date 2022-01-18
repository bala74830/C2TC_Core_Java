package TNS;
class base
{
static int i;
static void m1()
{
i=10;
System.out.println("hi in a base class");
}
}
class derived1 extends base
{
int j;
void m2()
{
System.out.println("Hi in a derived1 class");
}
}
class derived2 extends base
{
int k;
void m3()
{
System.out.println("Hi in a derived2 class");
}
}
class derived3 extends base
{
int l;
void m4()
{
System.out.println("Hi in a derived3 class");
}
}
class derived4 extends derived1
{
int m;
void m5()
{
System.out.println("Hi in a derived4 class");
}
}
public class hirarchialinheritancedemo
{
public static void main(String args[]){
derived1 obj=new derived1();
base.m1();
obj.m2();
derived2 obj1=new derived2();
obj1.m1();
obj1.m3();
derived4 obj2=new derived4();
obj2.m1();
obj2.m2();
obj2.m5();
}
}