package com.capg.corejava.MultiThreadingRevision;

//by default main thread is non-daemon thread and also we can not change its daemon nature otherwise Runtime Exception
//child thread always inherits daemon nature from its parent thread, however we can change its deamon nature if needed.
//------------------------------------------------------------------------------------------------------------------------

class MyThread14 extends Thread {
	// some code here
}

public class DaemonThread1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon()); // false
//		Thread.currentThread().setDaemon(true); // java.lang.IllegalThreadStateException
		
		MyThread14 t  = new MyThread14();
		System.out.println(t.isDaemon()); // false -> daemon nature is inherited from parent thread
		t.setDaemon(true);
		System.out.println(t.isDaemon()); //true -> we have manually changed its daemon nature
	}

}
