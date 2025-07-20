import java.util.*;
class ArraysDemo 
{
	public static void main(String[] args) 
	{
		int[] primitiveArray={20,10,70,40,60};
		System.out.println("Privmiteive Array Before  Sorting..");
		for(int i : primitiveArray){
			System.out.println(i);// 20,10,70,40,60
		}
		Arrays.sort(primitiveArray);
		System.out.println("Privmiteive Array After  Sorting..");
		for(int i : primitiveArray){
			System.out.println(i);//10,20,40,60,70
		}
        String[] stringArray={"Z", "P", "A", "Q"};
		System.out.println(" Object Array Before Sorting");
		for(String s: stringArray){
			System.out.println(s);// Z P A Q
		}
		Arrays.sort(stringArray);
		System.out.println(" Object Array After Sorting");
		for(String s: stringArray){
			System.out.println(s);// A P Q Z
		}
		Arrays.sort(stringArray,new MyComparator());
		System.out.println(" Object Array After Sorting with comaprator");
		for(String s: stringArray){
			System.out.println(s);// Z Q P A
		}
	}
}
class MyComparator implements Comparator{
		public int compare(Object o1,Object o2){
			return o2.toString().compareTo(o1.toString());
		}
}