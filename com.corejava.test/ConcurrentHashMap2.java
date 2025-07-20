import java.util.*;
import java.util.concurrent.*;
class ConcurrentHashMap2 extends Thread
{
	public static Map m=new ConcurrentHashMap();
	public static void main(String[] args) throws Exception
	{
		m.put(10,"A");
		m.put(20,"B");
		m.put(30,"C");

		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
		   Map.Entry en=(Map.Entry)it.next();
    		System.out.println("Main Thread Iterating Map and current obj is "+en.getKey()+" "+en.getValue());
			Thread.sleep(2000);
			ConcurrentHashMap2 t1=new ConcurrentHashMap2();
			t1.run();
		}
		System.out.println(m);
	}

public void run(){
	System.out.println("Child Thread Updating Map and adding element");
	m.put(40,"D");
  }
}

/*O/ P is 
Main Thread Iterating Map and current obj is 20 B
Child Thread Updating Map and adding element
Main Thread Iterating Map and current obj is 10 A
Child Thread Updating Map and adding element
Main Thread Iterating Map and current obj is 30 C
Child Thread Updating Map and adding element
{20=B, 40=D, 10=A, 30=C}*/

