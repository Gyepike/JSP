package stringtest;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class DataStore<T> {
	public DataStore(T myVariable) {
		this.myVariable = myVariable;
	}

	private T myVariable;

	public T getMyVariable() {
		return myVariable;
	}

	public void setMyVariable(T myVariable) {
		this.myVariable = myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}

}

public class ArrazList3 {

	public static void main(String[] args) {

		ArrazList3 comp = new ArrazList3();
		List<DataStore<Object>> elements = new LinkedList<>();

		elements.add(new DataStore<Object>("Ed"));
		
		
		elements.add(new DataStore<Object>('*'));
		elements.add(new DataStore<Object>("Ed"));
		elements.add(new DataStore<Object>("John"));
		elements.add(new DataStore<Object>("Apes"));
		elements.add(new DataStore<Object>(45));
		elements.add(new DataStore<Object>(45.5));
		elements.add(new DataStore<Object>(50d));

		comp.printlist(elements);

	}

	private void printlist(List<DataStore<Object>> list) {
		System.out.println("*****************************************");
		ListIterator<DataStore<Object>> iterator = list.listIterator(); // oly list types stack vector linked list array

		// System.out.println(iterator);

		while (iterator.hasNext()) {

			System.out.println(iterator.next().getMyVariable());
		}

		System.out.println("*****************************************");
	}

}
