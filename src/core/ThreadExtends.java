package core;

public class ThreadExtends {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("current thread1: " + Thread.currentThread().getName());
		Thread t1 = new Thread() {			
			public void run() {
				for(int i = 0; i < 100; i++) {
					try {
						Thread.sleep(1000); //current thread will be slept
						//System.out.println("Current thread: " + Thread.currentThread().getName());
						System.out.println("Current thread2: " + Thread.currentThread().getName() + " invoked after 1s.");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("count: " + i);
				}
			}
		};
		t1.start();
		t1.sleep(1500);//This will sleep the main method, it will not invoke specific thread
		t1.run();
		System.out.println("Current thread3: " + Thread.currentThread().getName());
//		try {
//			System.out.println("Current thread4: " + Thread.currentThread().getName());
//			t1.join(); //main thread will wait for t1 to complete
//			System.out.println("Current thread5: " + Thread.currentThread().getName());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}

//Thread is an engine -> Kitchen or worker
//Runnable is a task -> chef
//Thread can be invoked only once and not invoked next time and if invoke 2nd time IllegalThreadStateException will occur.
//Class can be completely turned into Thread by extends. limits inheritance. 
//Mostly will use runnable interface
//Runnable interface will have only one run method and it needs engine that is thread class which used to drive the task
//Thread is lightweight subprocess which uses same shared memory so context switch will be smooth and cost effective
//Process is heavy and each process have own memory space and context switch will take more cost.
//Multi tasking - multiple task can be performed simultaneously
//2 ways to achieve multi threading, multi processing
//start() -> will tell JVM and allocate its own stack. each thread runs separate and have own stack.
//race condition -> all threads access the same shared varaible which will give inconsitent/lose of data
//deadlock -> if thread A wants to access from ThreadB but threadB wants to access theradA, each will depend each other and stalls
//Thread.sleep() -> current thread will be moved to suspended state for the time specified and blocks the execution
//t1.wait() -> synchronized block usually acquires lock for a thread and will not allow other thread to access until other thread complets its work.
//t1.notify() -> it will notify the waiting thread to resume its work. Producer/consumer.
//t1.join() -> wait for the other thread to complete. Main thread will wait for the child thread to complete its work.
//Thread states -> new -> start -> runnable -> running -> suspended -> terminated (stop or error or finished)
//Thread states -> new -> start -> runnable (start) -> running (cpu will allocate time) -> suspended (sleep) -> resume (runnable & running) -> terminated (stop or error or finished)
//In concurrency, 
//1. ThreadLocal -> isolates the variable for the thread
//2. ExecutorService ex = Executor.newFixedThreadPool(5); ex.execute(() -> perform task);
//Priorities can be given to the thread. min - 1, normal - 5, max - 10
//Priority based thread execution depends on thread schedulers - preemptive, time slicing, first come first serve 
//Deamon thread -> It provides service thread to the user thread to run a job in background. life of this depends on the user thread, if no user thread then this thread will be killed by JVM
//ThreadPool -> group of threads created and reused for task, no need to create new threads again and again. A thread
//from the thread pool is pulled out and assigned a job by the service provider. newFixedThreadPool(5).
//
