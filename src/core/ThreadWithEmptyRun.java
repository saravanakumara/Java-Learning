package core;

public class ThreadWithEmptyRun {
	public static void main(String[] args) {
		System.out.println("Current thread name1: " + Thread.currentThread().getName());
		System.out.println("Current thread priority: " + Thread.currentThread().getPriority());
		Thread n1 = new Thread(); //Created a new Thread object in the New state. didn't pass a Runnable or override the run() method, this thread has an "empty" task. It's like hiring a chef but giving them no recipe.
		System.out.println("Name: " + n1.getName());
		System.out.println("Priority: " + n1.getPriority());
		n1.start(); //The JVM creates a new call stack. Thread moves to the Runnable state. CPU eventually executes the run() method of t1 on this new thread.
		//Because the run() method is empty, this new thread starts, sees there is nothing to do, and terminates immediately.
		System.out.println("Current thread name after start: " + Thread.currentThread().getName());
		n1.run(); //looks like normal method call on the main thread's stack, because the run method does not overridden.
		//The main thread stops what it's doing, enters the run() method of the n1 object, executes the empty code, and then returns to the next line in main.
		System.out.println("Current thread after run: " + Thread.currentThread().getName());
		try {
			System.out.println("Thread state: " + n1.getState());
			n1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Interrupted by others");
		}
		//with this we are just wasting memory and spawning thread that does nothing, i.e wasting CPU cycle
	}

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Run: " + i);
		}
	}
}

//what jvm will do for marker interface?
//how objects are converted into stream of bytes
//show you a code example of how to use transient to protect specific data during this process?
//So transient for final will not work as it always will be streamed. this is exceptional for final variable? and static values are not streamable.
//contiguous ?
//volatile
//volatile in java, the values will be available in the main memory and accessible by all threads. the value may get corruptted.?
//checked/unchecked exceptions?
//