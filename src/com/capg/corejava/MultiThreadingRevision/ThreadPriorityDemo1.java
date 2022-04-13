package com.capg.corejava.MultiThreadingRevision;

//Setting and Getting priority of threads.
//Priority range -> 1 to 10, where 1 is MIN_PRIORITY, 10 is MAX_PRIORITY & 5 is Default_Priority only for main thread.
//Default priority for every child thread is inherited from its Parent Thread who created its Object.
//--------------------------------------------------------------------------------------------------------------------------
class MyThread6 extends Thread {

	// Overridden run method here
}

public class ThreadPriorityDemo1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority()); // 5

//		Thread.currentThread().setPriority(15); // -> R.E: IllegalArgumentException
		Thread.currentThread().setPriority(8);

		// main thread creating Object of child Thread
		MyThread6 t = new MyThread6();
		System.out.println(t.getPriority()); // 8 -> inerited from Parent thread which is main thread

	}

}
