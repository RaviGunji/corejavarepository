class GenericBoundaryTest 
{
	public static void main(String[] args) 
	{
		Test<Integer> t1=new Test<Integer>();
//		Test<String> t2=new Test<String>();// type argument String is not within bounds of type-variable T
		Test1<Thread> t3=new Test1<Thread>();
		Test1<Runnable> t4=new Test1<Runnable>();
//		Test1<Integer> t4=new Test1<Integer>();// type argument Integer is not within bounds of type-variable T
	}
}
class Test<T extends Number>
{
}
class Test1<T extends Runnable>
{
}
/*class Test2<T extends Number & Thread>
{
}*///Not allowed
/*class Test3<T extends Runnable & Number>
{

}*///not allowed
class Test3<K,V>
{
}
class Test4<K,V,X>
{
}
class Test5<Ravi,Shiva,Hari>
{
}