

public class HelloThread extends Thread {

	
	public static void main(String[] args){
		for (int i=0; i<10; i++){
			(new HelloThread()).start();
		}
	}
	
	public void run(){
		System.out.println("Hello World!"+this.getId());
	}
}
