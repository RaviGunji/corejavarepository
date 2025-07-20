import java.util.*;
import java.util.concurrent.*;
class ConcurrentCollectionDemo1 extends Thread
{
	public static Map m=new HashMap();
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
			ConcurrentCollectionDemo1 t1=new ConcurrentCollectionDemo1();
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
Main Thread Iterating List and current obj is 10
Child Thread Updating Arraylist and adding element
Exception in thread "main" java.util.ConcurrentModificationException
*/

