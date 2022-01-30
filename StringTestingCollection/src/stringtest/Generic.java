package stringtest;

class GenericClass<T> {

	public GenericClass(T data) {
		this.data = data;
	}

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

class Data2 {

	private Object obj;

	public Data2(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}

}

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Data2 data = new Data2("Some String"); String stored = (String)
		 * data.getObj(); System.out.println(stored);
		 */
         GenericClass<String> dataClass = new GenericClass<> ("Some text");
         
         String data = (String)  dataClass.getData();
         
         System.out.println(data);
         
	}
	
	
	

}
