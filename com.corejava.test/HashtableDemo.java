import java.util.*;
class HashtableDemo 
{
	public static void main(String[] args) 
	{
		Hashtable t=new Hashtable();
		Temp t1=new Temp(5);
		/*Temp t2=new Temp(2);
		t.put(t1,t1.hashCode());
		t.put(t2 ,t2.hashCode());*/
		t.put(new Temp(5),"A");
		t.put(new Temp(2),"B");
		t.put(new Temp(6),"C");
		t.put(new Temp(15),"D");
		t.put(new Temp(23),"E");
		t.put(new Temp(16),"F");
        //t.put("Test",null);
		System.out.println(t);//{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
	}
}
class Temp
{
	int i;
	public Temp(int i){
		this.i=i;
	}
	public int hashCode(){
		//return i%9;
		return i;
	}
	public String toString(){
		return i+"";
	}
}
