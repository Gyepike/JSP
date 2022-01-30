package stringtest;

public class Concurent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from main thread ");

		AnotherThread anotherThread = new AnotherThread();

		anotherThread.start();

		new AnotherThread() {

			public void run() {

				System.out.println("Hello anonymous class thred");
			}

			;

		}.start();

		System.out.println("Hello again from main thread ");
        
	}

}
