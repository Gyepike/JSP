package stringtest;

class DataBond<K extends String ,V extends Number > {
	
	 private K key;
	 private V value;
	  
	  public DataBond(K key, V value) {
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
	
	
    public <E extends Character, N extends Number> void  display(E elemet, N number) {
		
    	System.out.println("Element "+ elemet +" Number " + number);
	}


    
	public String toString() {
		return "DataBond [key=" + key + ", value=" + value + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	  
}

public class GenericBond {

	public static void main(String[] args) {

		
		 DataBond<String, Number> bond = new DataBond<String, Number>("$", 5);
		 
		 bond.display('%', bond.getValue());
		 
		 bond.display('*',2f);
		 
	}

}
