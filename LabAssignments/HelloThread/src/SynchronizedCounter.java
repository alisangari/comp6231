
public class SynchronizedCounter{

	private int c;
	
	public SynchronizedCounter(){
		this.c = 0;
	}
	
	public void increment(){
		c++;
	}
	
	public void decrement(){
		c--;
	}
	
	public int value(){
		return c;
	}
	
	
	
	

}
