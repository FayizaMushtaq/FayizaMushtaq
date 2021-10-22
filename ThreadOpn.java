//Multithreading operations//
class A extends Thread
{
public void run()
{
int x=7,y=5,z;
z=x+y;
System.out.println(Thread.currentThread()+"From A="+z);
}
}
class B extends Thread
{
public void run()
{
int x=7,y=5,z;
z=x-y;
System.out.println(Thread.currentThread()+"From B="+z);
}
}
class C extends Thread
{
public void run()
{
int x=7,y=5,z;
z=x*y;
System.out.println(Thread.currentThread()+"From C="+z);
}
}
class ThreadOpn
{
public static void main(String args[])
{
new A().start();
new B().start();
new C().start();
}
}