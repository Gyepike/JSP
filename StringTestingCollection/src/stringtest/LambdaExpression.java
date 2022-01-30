package stringtest;


interface Lambda {
	
	public void demo();

}

public class LambdaExpression {

	public static void main(String[] args) {
      		
	/*	Lambda lambda =  new Lambda() {
			
			@Override
			public void demo() {
			    System.out.println("Statment 1");
			}
		};
		
		*/
		
		Lambda lambda = () -> { 
		System.out.println("Statment 1 Lambda"); 
		System.out.println("Statment 2 Lambda"); 
		}
		;
		lambda.demo();
		
	
		 new Thread( () -> { 
			System.out.println("Hello Thread"); 
			System.out.println("Hello Thread");
		 }
		).start();
		 
		 
		 Thread t =  new Thread( () -> {
			 
			 System.out.println("Hello2");
			 System.out.println("Hello2");
			 
		 }
				 
				 );
		 
		 t.start();
		
                 	 

	}

}
