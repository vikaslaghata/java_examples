import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecutorThreadPool {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		Runnable worker = new WorkerThread();
		pool.execute(worker);
		pool.execute(worker);
		pool.execute(worker);
		pool.shutdown();
		
		BlockingQueue<String> blockingQueueArray = new ArrayBlockingQueue<String>(2);
		try {
			blockingQueueArray.put("elem1");
			blockingQueueArray.put("elem1");
			//blockingQueueArray.put("elem1");  // If we do this then array will wait infinitely to delete one existing element.
			
			blockingQueueArray.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		BlockingQueue<String> blockingQueueLinked = new LinkedBlockingQueue<String>();
		
		System.out.println("Done");
	}
}

class WorkerThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Started");
		try {				
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
