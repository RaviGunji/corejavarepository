import java.util.*;
class IdentityHashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap m=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1,"Pawan");
		m.put(i2,"Kalyan");
		System.out.println(m);//{10=Kalyan}
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put(i1,"Pawan");
		ihm.put(i2,"Kalyan");
		System.out.println(ihm);//{10=Pawan, 10=Kalyan}
	}
}
