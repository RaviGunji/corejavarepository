import java.util.*;
class GenericsTypeErasureDemo 
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList<String>();//no error since compiler will check only reference type so here no type so we can add anytpe but run time it will remove <string> so no error 
		l.add(10);
		l.add(10.5);
		l.add(true);
		System.out.println(l);
	}
}

class Test
{
	public void m(ArrayList<String> l){//m1(ArrayList l)
	}
//	public void m1(ArrayList<Integer> l){//m1(ArrayList l) so no overloading allowed with same signaure
	//}
}
