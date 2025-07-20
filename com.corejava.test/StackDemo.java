import java.util.Stack;
class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);//A B C since insertion order is preserved
		System.out.println(s.search("B"));//2
		System.out.println(s.search("T"));//-1
        System.out.println(s.peek());//C
		System.out.println(s.pop());//C
		System.out.println(s);//A B
		System.out.println(s.capacity());//10
		System.out.println(s.get(0));//A
		s.removeAllElements();
		System.out.println(s);
	}
}
