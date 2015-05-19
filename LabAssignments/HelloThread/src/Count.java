public class Count {

	public static void main(String[] args) {
		SynchronizedCounter syncCounter = new SynchronizedCounter();
				
		

//		for (int i = 0; i < 10; i++) {
			IncrementThread A = new IncrementThread(syncCounter);
			DecrementThread B = new DecrementThread(syncCounter);
			A.start();
//			System.out.println("A" + syncCounter.value());
			B.start();
//			System.out.println("B" + syncCounter.value());
//		}
			try{
		A.join();
		B.join();
			}
			catch(Exception e){
				
			}
		System.out.println(syncCounter.value());
	}

}
