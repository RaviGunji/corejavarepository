import java.util.*;
class ArraysSerachDemo 
{
	public static void main(String[] args) 
	{
		int[] a={10,5,20,11,6};
		Arrays.sort(a);//6,6.10,11,20
		System.out.println(Arrays.binarySearch(a,6));//1
		System.out.println(Arrays.binarySearch(a,14));//-5
		 String[] s={"A", "Z","B"};
		 Arrays.sort(s);// A B Z
		 System.out.println(Arrays.binarySearch(s,"Z"));//2
		 System.out.println(Arrays.binarySearch(s,"S"));//-3
		Arrays.sort(s,new MyComparator());// Z B A
		 System.out.println(Arrays.binarySearch(s,"Z",new MyComparator()));//o
		 System.out.println(Arrays.binarySearch(s,"S",new MyComparator()));//-2
		  System.out.println(Arrays.binarySearch(s,"S"));//-4 up predictable serach since no comparator
	}
}
class MyComparator implements Comparator{
		public int compare(Object o1,Object o2){
			return o2.toString().compareTo(o1.toString());
		}
}