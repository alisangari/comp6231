public class IncrementThread extends Thread{
	SynchronizedCounter sc;

	public IncrementThread(SynchronizedCounter sc) {
		this.sc = sc;
	}

	public void run() {
//		if (sc.value() > 0) {
//			System.out.println(sc.value());
//		}
		System.out.println(this.getId() + ": ++ " + sc.value() + "=> ");
		sc.increment();
		 System.out.println(this.getId() + ": " + sc.value());
	}
}
