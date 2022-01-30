package tesztaaa;




public class Hello {
	private static void stringTest() {
		// TODO Auto-generated method stub
		int a = 12;

		// NON synchronized
		StringBuilder sb = new StringBuilder();

		long startTme = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			sb.append("hello");
		}

		long endTme = System.currentTimeMillis();

		long duration = endTme - startTme;

		System.out.println("Time " + duration);
		// synchronized

		StringBuffer sbuff = new StringBuffer();

		startTme = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			sbuff.append("hello");
		}

		endTme = System.currentTimeMillis();

		duration = endTme - startTme;

		System.out.println("Time " + duration);

		String str1 = "FB";
		String str2 = "Ea";

		System.out.println(str1.hashCode() + " egyforma néha hashcode equas a biztos !!" + str2.hashCode());
		System.out.println(str1);

		String s3 = new String("java");
		String s4 = new String("java");

		s4.toLowerCase();
		s3 = "c++";
		System.out.println(s3 + " " + s4);
	}

	public static void main(String[] args) {
		stringTest();
	}

}
