package stringtest;

class MyCounter  extends Thread{

	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}

	public void countMe() {
	
		 for (int i = 0; i <= 10; i++) {
			 try {
				sleep(500);
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
		System.out.println("*********Alwys use START method !!!!******************");
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required :" + (endTime-startTime));
		
	
		
	}
}

public class ThreadExamplerunnable {

	public static void main(String[] args) {
	   
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		
		
		counter1.start();  //run should be not called JVM use start !!+
		System.out.println("*********Alwys use START method !!!!******************");
		counter2.start();
		
		System.out.println("*********Alwys use START method !!!!******************");
		
		
	}

}
