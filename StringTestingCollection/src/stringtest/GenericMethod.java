package stringtest;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class DataGen <K,V >  {
	
	
	public DataGen(K key, V value) {
		this.key = key;
		this.value = value;
	}
	private K key;
	private V value;
	
	
	
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
		return "DataGen [key=" + key + ", value=" + value + "]";
	}
	public <E, N> void display(E element, N number) {
		System.out.println("Element : "+element+" Number :"+number);

	}
}

public class GenericMethod {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
       
	  GenericMethod gen = new GenericMethod();	
	  DataGen<Object,Object> k =   new DataGen<>("h",23);
	   
      List<DataGen<Object, Object>> elements = new LinkedList<> ();
       
       System.out.println(k);
       k.display("Mama ", 77);
      
      elements.add(new DataGen<Object, Object>("Hello", 2));
      
      elements.add(new DataGen<Object, Object>("h",23));
      elements.add(new DataGen<Object, Object>("AA",4));
      elements.add(new DataGen<Object, Object>(87,6));
      elements.add(new DataGen<Object, Object>("%",6));
      
      
      //System.out.println(elements);
      
      gen.printlist(elements);
       
	}

	
	private void printlist(List<DataGen<Object, Object>> list) {
		System.out.println("*****************************************");
		ListIterator<DataGen<Object, Object>> iterator = list.listIterator(); // oly list types stack vector linked list array

		// System.out.println(iterator);

		while (iterator.hasNext()) {

			System.out.println(iterator.next().getKey()+" ");
		}

		System.out.println("*****************************************");
	}
}
