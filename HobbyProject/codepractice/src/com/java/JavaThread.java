
public class JavaThread implements Runnable{

	public static void main(String[] args) {
		//JavaThread thread = new JavaThread(); // synchronized on object will work only if we have one object for T1 & T2 threads.
		Thread t1 = new Thread(new JavaThread(),"T1");
		t1.start();
		Thread t2 = new Thread(new JavaThread(),"T2");
		// t2.setDaemon(true);
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Done");
	}

	@Override
	public void run() {
		doSomething();		
	}

	private void doSomething() { // method level synchronized will work only for single JavaThread instance.
		synchronized (JavaThread.class) { // class level synchronized will work even we are passing two JavaThread instances. Class level apply for static methods as well.
			for(int i=0;i<5;i++) {
				System.out.println("Thread running "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Thread Done "+Thread.currentThread().getName());
			
		}
		
	}
	
}


