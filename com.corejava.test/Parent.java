class Parent 
{
	int i=10;
	{
		m1();
		System.out.println("Parent Instant Block");
	}
	Parent(){
		System.out.println("Parent constructor");
	}
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		System.out.println("Parent Main");
	}
	public void m1(){
		System.out.println(j);
	}
	int j=20;
}
class Child extends Parent
{
	int x=100;
	{
		m2();
		System.out.println("Child First Instance Block");
	}
	Child(){
		System.out.println("Child Constructor");
	}
	public static void main(String[] str){
      Parent p=new Parent();
	  System.out.println("Child Main");
	}
	public void m2(){
		System.out.println(j);
	}
	{
		System.out.println("Child Second Instance Block");
	}
	int j=200;

}
