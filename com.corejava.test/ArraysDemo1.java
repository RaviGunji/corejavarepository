import java.util.*;
class ArraysDemo1 
{
	public static void main(String[] args) 
	{
		String[] s={ "A", "Z", "B"};
		List l =Arrays.asList(s);
		System.out.println(l);// A Z B
		s[0]="S";
		System.out.println(l);// S Z B
       //l.add("R");// UnsuportedOperationException
		//l.remove("S");// UnsuportedOperationException
		l.set(1,"N"); // success since no change in in size 
		System.out.println(l);
		l.set(2,new Integer(10));// ArrayStoreException
	}
}
