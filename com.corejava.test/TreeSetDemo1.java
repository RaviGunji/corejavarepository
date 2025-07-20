import java.util.*;
class TreeSetDemo1 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("Z");
		t.add("a");
		t.add("L");
        //t.add(null);// R. E : NullPointerException
		//t.add(new Integer(1));//R.E : ClassCastException
		System.out.println(t);//[A, L,Z ,a]

	}
}
