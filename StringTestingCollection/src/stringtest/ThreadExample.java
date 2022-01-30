package stringtest;

class MyCounterRunnable  implements Runnable{

	private int threadNo;

	public MyCounterRunnable(int threadNo) {
		this.threadNo = threadNo;
	}

	public void countMe() {
	
		 for (int i = 0; i <= 10; i++) {
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thhe value if I is is : " + i + " and the thread number is : "+ threadNo);
		}
	}
	@Override
	public void run() {
		long startTime = System.currentTimeMillis(); 
		countMe();
		//System.out.println("*********Alwys use START method !!!!******************");
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required :" + (endTime-startTime));
		
	
		
	}
}

public class ThreadExample {

	public static void main(String[] args) {
	   
		/*
		 * Thread thread1 = new Thread(new MyCounterRunnable(1)); Thread thread2 = new
		 * Thread(new MyCounterRunnable(2));
		 * 
		 * 
		 * //run should be not called JVM use start !!+
		 * System.out.println("*********Alwys use START method !!!!******************");
		 * thread1.start(); thread2.start();
		 * System.out.println("*********Alwys use START method !!!!******************");
		 */
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("First thread ");
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thhe value First Thread  if I is is : " + i + " and the thread number is : ");
				}
				// TODO Auto-generated method stub
				
			}
		}
		).start();
		;
		
      new Thread(() ->  {
    	  System.out.println("Second Thread ");
		
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("The value Second Thread if I is is : " + i + " and the thread number is : ");
			}
      }
		).start();
		;
		
	}

}
