import java.util.*;
class GenericsDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l1=new ArrayList<String>();
		ArrayList<?> l2=new ArrayList<String>();
		ArrayList<?> l3=new ArrayList<Integer>();
		ArrayList<? extends Number> l4=new ArrayList<Double>();
		//ArrayList<? extends Number> l5=new ArrayList<String>();// incompatible types: ArrayList<String> cannot be converted to ArrayList<? extends Number> 
		//ArrayList<?> l6=new ArrayList<?>();//unexpected type class or interface without bounds ?
		//ArrayList<?> l7=new ArrayList<? extends Number>();//unexpected type class or interface without bounds ? extends Number
		ArrayList<? super String> al8=new ArrayList<Object>();
		ArrayList<Object> al9=new ArrayList<Object>();
		//ArrayList<> al10=new ArrayList<>();//Illega Start of Type
	}
}
