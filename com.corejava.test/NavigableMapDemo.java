import java.util.*;
class NavigableMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap();
		t.put("B","Ball");
		t.put("A","Apple");
		t.put("D","Dog");
		t.put("E","Elephant");
		t.put("C","Cat");
		System.out.println(t);//{A=Apple, B=Ball, C=Cat, D=Dog, E=Elephant}
		System.out.println(t.higherKey("B"));//C
		System.out.println(t.ceilingKey("C"));//C

		System.out.println(t.lowerKey("C"));//B
		System.out.println(t.floorKey("C"));//C

		System.out.println(t.pollFirstEntry());//{A=Apple}
		System.out.println(t.pollLastEntry());//{E=Epephant}
		System.out.println(t.descendingMap());//{D=Dog,C=Cat,B=Ball}
		System.out.println(t);//{B=Ball,C=Cat,D=Dog}
	}
}
