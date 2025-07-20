import java.util.*;
import java.util.concurrent.*;
class CopyOnWriteArrayListDemo3 extends Thread
{
	public static List l=new CopyOnWriteArrayList();
	public static void main(String[] args) throws Exception
	{
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		Iterator it=l.iterator();
		CopyOnWriteArrayListDemo3 t1=new CopyOnWriteArrayListDemo3();
			t1.run();
		while(it.hasNext()){
    		System.out.println("Main Thread Iterating List and current obj is "+it.next());
			Thread.sleep(2000);
		}
		System.out.println(l);//[10, 20, 30, 40, 50]
	}
public void run(){
	System.out.println("Child Thread Updating Arraylist and adding element");
	l.add(50);
  }
}

/*O/ P is 
Child Thread Updating Arraylist and adding element
Main Thread Iterating List and current obj is 10
Main Thread Iterating List and current obj is 20
Main Thread Iterating List and current obj is 30
Main Thread Iterating List and current obj is 40
[10, 20, 30, 40, 50]
*/

