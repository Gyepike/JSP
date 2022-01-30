package stringtest;

import java.util.ArrayList;

import javax.print.attribute.standard.Finishings;

public class ArrayListAPP {

	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addData();

		// System.out.println(lisNames);
		ArrayListAPP app = new ArrayListAPP();
		app.removeNameByPostion(0);
		// app.removeNameByString("Salim");

		System.out.println("-----------------------");
		app.displayList(listNames);
		System.out.println("-----------------------");

		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1));
		System.out.println("-----------------------");
		app.modifyName(3, "Cula");
		System.out.println("-----------------------");
		app.displayList(listNames);

		System.out.println("-----------------------");

		System.out.println(app.findNameByString("Mia"));
	}

	private void modifyName(int pos, String name) {
		listNames.set(pos, name);

	}

	private static void addData() {
		listNames.add("Munyó");
		listNames.add("Chaand");
		listNames.add("John");

		listNames.add("Steve");
		listNames.add("Rahul");
		listNames.add("Mia");

		listNames.add("Pooja");
		listNames.add("Salim");
		listNames.add("Angel");
	}

	void displayList(ArrayList<String> names) {

		for (String name : names) {
			System.out.println(name);
		}
	}

	void removeNameByPostion(int position) {
		listNames.remove(position);

	}

	void removeNameByString(String name) {
		listNames.remove(name);
	}

	int findNameByString(String name) {
		System.out.println(listNames.contains(name));
		return listNames.indexOf(name);
	}

}
