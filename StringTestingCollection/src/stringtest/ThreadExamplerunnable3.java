package stringtest;

public class ThreadExamplerunnable3 {

	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("*********Alwys use START method !!!!******************");

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					ThreadExamplerunnable3.counter++;
				}

				//System.out.println("The Value number " + counter);
				System.out.println("first Thread over ");

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					ThreadExamplerunnable3.counter++;
				}

				//System.out.println("The Value number " + counter);
				System.out.println("Second  Thread over ");
 			}
		}
		
				);

		thread1.start();
		thread2.start();
		
		Thread.sleep(400);
		System.out.println(counter);
		
		System.out.println("started");
		System.out.println("*********Alwys use START method !!!!******************");

	}

}
