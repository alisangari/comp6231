
public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("HelloRunnable"+Thread.currentThread().getId());
	}
	
	public static void main(String[] args){
		for(int i=0; i<10; i++){
			new Thread((new HelloRunnable())).start();
		}
	}

}
