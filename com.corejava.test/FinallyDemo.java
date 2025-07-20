class FinallyDemo 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("Try");
			//System.exit(1000); 0-> Normal Termination
		}catch(Exception e){
			System.out.println("Catch");
		}
		finally{
			System.out.println("Finally");
		}
	}
}
