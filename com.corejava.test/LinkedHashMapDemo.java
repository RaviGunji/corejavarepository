import java.util.*;
class LinkedHashMapDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashMap m=new LinkedHashMap();
		m.put("Chiru",200);
		m.put("Bayalayya",500);
		m.put("Venky",700);
		m.put("Nag",800);
		m.put(null,null);
		System.out.println(m);
	}
}
