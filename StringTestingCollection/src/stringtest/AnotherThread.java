package stringtest;

public class AnotherThread extends Thread {

	
	@Override
	public void run() {
		System.out.println("Hello 2 From another thread");
	}
}
