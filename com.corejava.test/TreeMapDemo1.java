import java.util.*;
class TreeMapDemo1 
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap(new MyComparator());
		t.put("XXX",10);
		t.put("AAA",20);
		t.put("ZZZ",30);
		t.put("RRR",40);
		//t.put(40,40);//accept heteroginious
		System.out.println(t);//{ZZZ=30, XXX=10, RRR=40, AAA=20, 40=40}
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}
