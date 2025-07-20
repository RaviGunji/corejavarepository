import java.util.concurrent.*;
class ExcecutorDemo1 
{
	public static void main(String[] args) 
	{
		MyJob[] jobArray={new MyJob("Ravi"),
											new MyJob("Siva"),
											new MyJob("Ajay")	,
											new MyJob("Vijay"),
											new MyJob("Anil"),
											new MyJob("Sunil")};
		MyJob job=new MyJob("Extra Job");
	ExecutorService service=Executors.newFixedThreadPool(1);
	for(MyJob j:jobArray){
		service.submit(j);
	}
	service.submit(job);
	service.shutdown();
}
}
class MyJob implements Runnable
{
	String name;
	MyJob(String name){
		this.name=name;
	}
	public void run(){
		System.out.println(name+ " Job started by "+Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}catch(Exception e){}
		System.out.println(name+" Job Ended by "+Thread.currentThread().getName());
	}
}

/*
Ravi Job started by pool-1-thread-1
Ravi Job Ended by pool-1-thread-1
Siva Job started by pool-1-thread-1
Siva Job Ended by pool-1-thread-1
Ajay Job started by pool-1-thread-1
Ajay Job Ended by pool-1-thread-1
Vijay Job started by pool-1-thread-1
Vijay Job Ended by pool-1-thread-1
Anil Job started by pool-1-thread-1
Anil Job Ended by pool-1-thread-1
Sunil Job started by pool-1-thread-1
Sunil Job Ended by pool-1-thread-1
Extra Job Job started by pool-1-thread-1
Extra Job Job Ended by pool-1-thread-1
*/