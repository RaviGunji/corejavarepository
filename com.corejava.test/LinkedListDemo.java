import java.util.*;
class LinkedListDemo 
{
	public static void main(String[] args) 
	{
       LinkedList l =new LinkedList();
	   l.add("Ravi");
	   l.add(10);
	   l.add(null);
	   l.add("Ravi");//Ravi ,10,null,Ravi
	   l.set(0,"Hey");//Hey ,10,null,Ravi
	   l.add(0,"Hello");//Hello,Hey,10,null,Ravi
	   l.removeLast();//Hello ,Hey10,null
	   l.addFirst("Mr");//Mr Hello,Hey 10,null
	   System.out.println(l);
	}
}
