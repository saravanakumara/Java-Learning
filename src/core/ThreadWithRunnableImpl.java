package core;

public class ThreadWithRunnableImpl implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new ThreadWithRunnableImpl());
		t1.start();
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(500);
		t1.run(); //This is bad idea.

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 10; i < 30; i++) {
			System.out.println("runnable task: " + i);
			System.out.println("inside run: " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				System.out.println("After 1s sleep: " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
