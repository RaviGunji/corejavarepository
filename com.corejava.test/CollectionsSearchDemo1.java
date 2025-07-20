import java.util.*;
class CollectionsSearchDemo1 
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,10,new MyComparator()));
		System.out.println(Collections.binarySearch(l,23,new MyComparator()));
				System.out.println(Collections.binarySearch(l,23));
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
}
