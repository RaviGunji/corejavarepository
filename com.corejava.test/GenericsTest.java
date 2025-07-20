import java.util.*;
class GenericsTest 
{
	public static void main(String[] args) 
	{
		String[] s=new String[10];
		s[0]="Ravi";
		//s[1]=new Integer(10);

		List<Integer> l=new ArrayList<Integer>();
//		l.add("Ravi");
		l.add(new Integer(10));
		//System.out.println(l);
		Integer name1=l.get(0);
		System.out.println(name1);
//		String name2=(String)l.get(1);
	//	System.out.println(name2);
	}
}
