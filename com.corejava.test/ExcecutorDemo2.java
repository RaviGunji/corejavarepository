import java.util.concurrent.*;
class ExcecutorDemo2 
{
	public static void main(String[] args) throws Exception 
	{
		MyCallable[] jobArray={new MyCallable(10),
											new MyCallable(20),
											new MyCallable(30)	,
											new MyCallable(40),
											new MyCallable(50),
											new MyCallable(60)};
	ExecutorService service=Executors.newFixedThreadPool(3);
	for(MyCallable j:jobArray){
		Future f=service.submit(j);
		System.out.print(f.get());
		System.out.println();
	}
	service.shutdown();
}
}
class MyCallable implements Callable
{
	int num;
	MyCallable(int num){
		this.num=num;
	}
	public Object call(){
		System.out.print(Thread.currentThread().getName()+ " is calculating first "+num+" numbers total: ");
		int sum=0;
		for(int i=1;i<=num;i++){
			sum=sum+i;
		}
		return sum;
	}
}

