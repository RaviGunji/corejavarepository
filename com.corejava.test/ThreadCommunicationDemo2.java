import java.util.*;
class ThreadCommunicationDemo2 
{
	public static void main(String[] args) 
	{
		Queue q=new PriorityQueue();
		ConsumerThread c=new ConsumerThread(q);
		
		ProduderThread p=new ProduderThread(q);
		p.start();
		c.start();
		
	}
}

class ConsumerThread extends Thread
{
	Queue q;
	public ConsumerThread(Queue	q){
		this.q=q;
	}
	public void run(){
		System.out.println("Consumer Thread Started");
		synchronized(q){
			try{
		for(int i=1;i<=5;i++){
		while(q.isEmpty()){
			System.out.println("Consumer is going to waiting state");
			q.wait();
		}
		System.out.println("Getting Item from queue: "+ q.poll());
		}
		}catch(Exception e){}
		}
		System.out.println("Consumer Thread Ended");
	}
}

class ProduderThread extends Thread
{
	Queue q;
	public ProduderThread(Queue q){
		this.q=q;
	}
	public void run(){
		System.out.println("Produder Thread Started");
		synchronized(q){
		for(int i=1;i<=5;i++){
		q.offer(i);
		System.out.println("Adding item to queue: "+i);
		q.notify();
		try{
		q.wait(5000);
		  }catch(InterruptedException e){
		  }
		  }
		}
		System.out.println("Produder Thread Ended");
	}
}