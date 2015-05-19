public class DecrementThread extends Thread {
	SynchronizedCounter sc;

	public DecrementThread(SynchronizedCounter sc) {
		this.sc = sc;
	}

	public void run() {
//		if (sc.value() < 0) {
//			System.out.println(sc.value());
//		}
		 System.out.println(this.getId() + ": -- " + sc.value() + "=> ");
		sc.decrement();
		 System.out.println(this.getId() + ": " + sc.value());
	}
}
