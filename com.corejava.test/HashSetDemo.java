import java.util.*;
class HashSetDemo 
{
	public static void main(String[] args) 
	{
		Collection h=new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add(null);
		h.add(10);
		System.out.println(h);
		System.out.println(h.add(10));
 	}
}
