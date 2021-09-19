package javat.Danger;



public class ThreadDemo {
	// Specify time(in seconds) as large as possible but it should not exceed the
	// limit
	// WARNING: A DANGEROUS PROGRAM YOUR PC MAY MISBEHAVE!

	private static NewThread n;
	private static long time = 5; // default
	

	public static void main(String args[]) {
		Thread.currentThread().setName("ThreadDemo");
		// create a new thread
		int x = 1;
		System.out.println("WARNING: A DANGEROUS PROGRAM YOUR PC MAY MISBEHAVE!");

		if (time == 5) {
			System.out.println("Specify time(in seconds) as large as possible but it should not exceed the limit");
			try {
				time = Long.valueOf(javat.Style.wait.scan());
				time *= 1000;
			} catch (NumberFormatException w) {
				System.out.println("DON'T TEST MY PROGRAM AGAIN!");

			} catch (Exception e) {
				System.out.println("Something Wrong happened!");

			}
		}

		for (; x > 0; x++)
			Generate(String.valueOf(x));
		try {
			for (;;) {
				n.t.join();
				if (!n.t.isAlive())
					break;
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread() + " Interrupted");
		}
		System.out.println("Main thread exiting.");

	}

	private static void Generate(String msg) {
		n = new NewThread(msg, time);
		System.out.println(msg + " Thread Generated");

	}
	
}// Create a second thread.

class NewThread implements Runnable {
	Thread t;
	private static long time;

	private static boolean Alive = false;

	NewThread(String naman, long tim) {
		// Create a new, second thread
		time = tim;
		t = new Thread(this, naman);
		t.setPriority(10);
		System.out.println(t + " RUNNING");
		t.start(); // Start the thread
	}

	// This is the entry point for the second thread.
	public void run() {

		try {
			Thread.sleep(time);
			String s = "naman";
			for (;;) {

				s = s + s;

				if (Alive)
					break;

			}
		} catch (Exception e) {
			System.out.println("ERROR!");

		}
		System.out.println(t + " EXITING");
	}
}