import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		List<String> resources = new ArrayList<>();
		Thread t1 = new Thread(new Producer(resources));
		
		Thread t2 = new Thread(new Consumer(resources));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}	
}

class Producer implements Runnable {
	List<String> resources;
	public Producer(List<String> resources) {
		this.resources = resources;
	}
	@Override
	public void run() {
		synchronized (resources) {
			for(int i=1;i<=10;i++) {
				resources.add("R "+i);
				System.out.println("added R "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
				
	}	
}

class Consumer implements Runnable {
	List<String> resources;
	
	public Consumer(List<String> resources) {
		this.resources = resources;
	}
	
	@Override
	public void run() {
		synchronized (resources) {
			while(!resources.isEmpty()) {
				System.out.println(resources.remove(0));
			}
		}
		
	}
}


