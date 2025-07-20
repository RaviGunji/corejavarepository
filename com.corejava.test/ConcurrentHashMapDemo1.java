import java.util.concurrent.*;
class ConcurrentHashMapDemo1 
{
	public static void main(String[] args) 
	{
	ConcurrentHashMap m=new ConcurrentHashMap();
	m.put(101,"A");
	m.put(102,"B");
	m.putIfAbsent(103,"C");//will put C
	m.putIfAbsent(101,"D");//Will not put
	m.remove(101,"D");
	m.replace(102,"B","E");
	System.out.println(m);//{101=A,102=E,103=C}
	}
}
