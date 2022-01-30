package stringtest;

class DataKey<K, V > {
	private K key;
	private V value;

	public DataKey(K  key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DataKey [key=" + key + ", value=" + value + "]";
	}
	
	public <E, N> void display(E element, N number) {
		System.out.println("Elemnt: "+ element + " Number: " + number);

	}
}

public class GenericAdvenced {

	public static void main(String[] args) {
		DataKey<Integer, String> datakey = new DataKey<Integer, String>(1, "Munyó");

		System.out.println(datakey);
		datakey.display("Munyóka", 2);
	}

}
