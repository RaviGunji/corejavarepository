import java.util.*;
class CollectionsSortDemo 
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add("X");
		l.add("R");
		l.add("B");
		l.add("C");
		//l.add(10);// Class Cast Exception
		//l.add(null);//NullPointerException
		System.out.println(l);//[X, R, B, C]
		Collections.sort(l);
		System.out.println(l);//[B, C, R, X]
	}
}
