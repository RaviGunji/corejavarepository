import java.util.*;
class CollectionsSortDemo1 
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add("X");
		l.add("R");
		l.add("B");
		l.add("C");
		//l.add(null);//NullPointerException
		System.out.println(l);//[X, R, B, C]
		Collections.sort(l,new MyComparator());
		System.out.println(l);//[B, C, R, X]
	}
}

class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2){

		return o2.toString().compareTo(o1.toString());
	}
}