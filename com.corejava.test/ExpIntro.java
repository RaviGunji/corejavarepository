class ExpIntro 
{
	public static void main(String[] args) 
	{
		doStuff();//control goes tto line no 8
		System.out.println("End of main()");////after executing this control goes end of main and gracefull terimination
	}
	public static void doStuff(){
		doMoreStuff();//control goes tto line no 12
		System.out.println("End of doStuff()");//after executing this control goes line 9
	}
	public static void doMoreStuff(){
		System.out.println("End of doMoreStuff()");//after executing this control goes line 10
	}
}
/*
End of doMoreStuff()
End of doStuff()
End of main()
*/
