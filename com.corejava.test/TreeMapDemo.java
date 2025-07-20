import java.util.*;
class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap();//for Default Natural Sorting Order
			t.put(100,"ABC");
			t.put(105,"XYZ");
			t.put(101,"PRQ");
			t.put(104,10);
			//t.put("A","A");//Class Cast Excpetion since this is DNSO
			//t.put(null,10);//Null pointer Expcetion since t has already elements

		System.out.println(t);//{100=ABC, 101=PRQ, 104=10, 105=XYZ}
	}
}
