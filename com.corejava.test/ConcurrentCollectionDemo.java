import java.util.*;
class ConcurrentCollectionDemo extends Thread
{
	public static List l=new ArrayList();
	public static void main(String[] args) throws Exception
	{
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		Iterator it=l.iterator();
		while(it.hasNext()){
    		System.out.println("Main Thread Iterating List and current obj is "+it.next());
			Thread.sleep(2000);
			ConcurrentCollectionDemo t1=new ConcurrentCollectionDemo();
			t1.run();
		}
	}
public void run(){
	System.out.println("Child Thread Updating Arraylist and adding element");
	l.add(50);
  }
}

/*O/ P is 
Main Thread Iterating List and current obj is 10
Child Thread Updating Arraylist and adding element
Exception in thread "main" java.util.ConcurrentModificationException
*/

