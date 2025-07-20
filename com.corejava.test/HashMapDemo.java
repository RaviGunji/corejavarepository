import java.util.*;
class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap m=new HashMap();
		m.put("Chiru",200);
		m.put("Bayalayya",500);
		m.put("Venky",700);
		m.put("Nag",800);
		m.put(null,null);
		System.out.println(m);//{Nag=800, Chiru=200, Venky=700, Bayalayya=500}
		System.out.println(m.containsKey("Nag1"));
		System.out.println(m.containsValue(200));
		System.out.println(m.get("Nag"));
		System.out.println(m.remove("Nag"));
		System.out.println(m);
		System.out.println(m.isEmpty());
		//m.clear();
		System.out.println(m);
       //System.out.println(m.get("Chiru"));//200
	  // System.out.println(m.keySet());//[Nag, Chiru, Venky, Bayalayya]
	   //System.out.println(m.values());//[800, 200, 700, 500]
	   //System.out.println(m.size());//4
	  // System.out.println(m.put("Chiru",2000));
		//System.out.println(m);	//{Nag=800, Chiru=2000, Venky=700, Bayalayya=500}
		Set s=m.entrySet();
		//System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry entry=(Map.Entry)itr.next();
			//System.out.print(entry.getKey()+"->"+entry.getValue());//Nag->800Chiru->2000Venky->700Bayalayya->500
		//	if(entry.getKey().equals("Nag"))
				//entry.setValue(8000);
	  }
	  		System.out.println();
	  		//System.out.println(m);//{Nag=8000, Chiru=2000, Venky=700, Bayalayya=500}
	}
}
