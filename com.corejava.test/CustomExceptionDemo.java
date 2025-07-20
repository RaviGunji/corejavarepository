class CustomExceptionDemo 
{
	public static void main(String[] args) 
	{
		int age=Integer.parseInt(args[0]);
		if(age>60)
			throw new TooOldException("Your marrige age is crossed you will not find matches");
		else if(age<21)
			throw new TooYoungException("Too Early to get Marrige please wait you will get best Match!");
		else
			System.out.println("Thanks for reach out us We will find best match soon  and share details!");
	}
}
class TooYoungException extends RuntimeException
{
	public TooYoungException(String s){
		//super(s);
	}
}
class TooOldException extends RuntimeException
{
	public TooOldException(String s){
		super(s);
	}
}