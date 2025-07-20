class NestedTryCatchFinallyFlowDemo 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("Outer try Block");
			try{
				System.out.println("Inner try Block");
				System.out.println(10/0);
			}catch(NullPointerException e){
				System.out.println("Inner Catch Block");
			}
			finally{
				System.out.println("Inner finally Block");
			}
			System.out.println("After innner try Catch Block");
		}catch(Exception e){
			System.out.println("Outer Catch Block");
		}
		finally{
			System.out.println("Outer Finally Block");
		}
	}
}
