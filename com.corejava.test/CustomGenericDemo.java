class CustomGenericDemo 
{
	public static void main(String[] args) 
	{
		MyGeneric<String>  t1=new MyGeneric<String>("Hi");
		t1.printClassName();
		System.out.println(t1.getObject());
		MyGeneric<Integer>  t2=new MyGeneric<Integer>(100);
		t2.printClassName();
		System.out.println(t2.getObject());
	}
}

class MyGeneric<T>
{
	T obj;
	public MyGeneric(T t){
	this.obj=t;
	}
	public void printClassName(){
		System.out.println("The class passed to Generic is :"+obj.getClass().getName());
	}
	public T getObject(){
		return obj;
	}
}
