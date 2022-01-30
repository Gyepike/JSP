package stringtest;


class Compare <T extends  Comparable > implements Comparable<T> { 
	
	private T myVariable;
	
	
	public Compare(T myVariable) {
		this.myVariable = myVariable;
	}


	public T getMyVariable() {
		return myVariable;
	}


	public void setMyVariable(T myVariable) {
		this.myVariable = myVariable;
	}


	@Override
	public String toString() {
		return "Compare [myVariable=" + myVariable + "]";
	}


	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return getMyVariable().compareTo(o);
	}

}

public class ComperatGeneric {

	public static void main(String[] args) {
		Compare<Integer> c  = new  Compare <Integer>(4);
		
	    System.out.println(c.compareTo(8));
	}

}
