package pack1;
 public class A 
{
protected void m1(){
	System.out.println("A m1()");
}
}
class C extends A
{
	public static void main(String[] str){
	A a=new A();
	a.m1();
	C c =new C();
	c.m1();
	A aa = new C();
	aa.m1();
	}
}
