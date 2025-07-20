import java.io.*;
class ExceptionDemo2
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("hi");
		}catch(IOException e){
	//		e.printStackTrace();
	//System.out.println(e.toString());
  		System.out.println(e.getMessage());
		}
//		System.out.println("End of main ()");
}
}
