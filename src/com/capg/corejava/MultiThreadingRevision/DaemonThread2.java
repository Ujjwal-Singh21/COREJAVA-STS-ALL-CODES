package com.capg.corejava.MultiThreadingRevision;

//If we are not commenting line 1, then main Thread -> non-daemon, but child Thread is -> daemon 
//hence once deamon thread(main) gets completed, immediately all non-damon gets terminated.
//------------------------------------------------------------------------------------------------------
class MyThread15 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class DaemonThread2 {

	public static void main(String[] args) {

		MyThread15 t = new MyThread15();
		t.setDaemon(true); //line-1
		t.start();

		System.out.println("End of main");

	}

}
