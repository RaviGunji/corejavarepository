import java.util.concurrent.*;
class CopyOnWriteArraySetDemo 
{
	public static void main(String[] args) 
	{
		CopyOnWriteArraySet s=new CopyOnWriteArraySet();
		s.add("A");
		s.add("B");
		s.add("A");// Duplicates not allowed
		s.add("D");
		s.add(10);//Heterogenious Allowed
		s.add(null);//Null insertion allowed
		s.add("E");
		System.out.println(s);//[A, B, D, 10, null, E]
	}
}
