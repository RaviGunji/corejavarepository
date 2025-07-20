import java.util.*;
class ComparableComparatorDemo 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		Employee e1=new Employee("Nag",100);
		Employee e2=new Employee("Balayya",200);
		Employee e3=new Employee("Chiru",50);
		Employee e4=new Employee("Venky",150);
		Employee e5=new Employee("Nag",100);
		t.add(e1);t.add(e2);t.add(e3);t.add(e4);t.add(e5);
		System.out.println(t);// [chiru--50, Nag--100, Venky--150, Balayya--200]
		TreeSet t1=new TreeSet(new EmployeeComparator());
		t1.add(e1);t1.add(e2);t1.add(e3);t1.add(e4);t1.add(e5);
		System.out.println(t1);// [Balayya--200,Chiru--50,Nag--100,Venky--150]
	}
}

class EmployeeComparator implements Comparator 
{
	public int compare(Object obj1,  Object obj2){//Only 
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.ename;
		String s2=e2.ename;
		return s1.compareTo(s2);
	}
}
class Employee implements Comparable 
{
	String ename;
	int eid;
	public Employee(String ename,int eid){
		this.ename=ename;
		this.eid=eid;
	}
	public String toString(){
		return ename+"--"+eid;
	}
	public int compareTo(Object obj){
		int eid1=this.eid;
		Employee emp=(Employee)obj;
		int eid2=emp.eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else 
			return 0;

}
}
