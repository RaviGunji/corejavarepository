import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
        l.remove(2);
		System.out.println(l);
		l.add(1,"M");
				System.out.println(l);
		l.add("N");
				System.out.println(l);
	}
}
