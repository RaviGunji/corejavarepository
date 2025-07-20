import java.util.*;
class ListIteratorDemo 
{
	public static void main(String[] args) 
	{
      LinkedList l=new LinkedList();
	  l.add("Balayya");
	  l.add("Venky");
	  l.add("Chiru");
	  l.add("Nag");
	  System.out.println(l);//[Balayya , Venky ,Chiru, Nag]
	  ListIterator itr=l.listIterator();
	  while(itr.hasNext()){
		  String name=(String)itr.next();
		  if(name.equals("Venky"))
			  itr.remove();
		  else if(name.equals("Chiru"))
			  itr.add("Charan");
		  else if(name.equals("Nag"))
			  itr.set("Chai");
			  	}
		  System.out.println(l);//[Balayya,Chiru,Charan,Chai]
		  l.forEach(x->System.out.print(x+"  "));
		  System.out.println(itr.getClass().getName());
}
}