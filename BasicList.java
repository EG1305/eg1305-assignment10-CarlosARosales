import java.util.ArrayList;

public class BasicList {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();

		for (Integer i = 10; i <= 100; i += 10) {
			myList.add(i);
		}

		System.out.println(myList);

		System.out.println("Size of the list is " + myList.size());

		myList.add(myList.size() / 2, 200);

		System.out.println(myList);
		System.out.println("Size of the list is " + myList.size());
		System.out.println("Value 200 is located at index " + myList.indexOf(200));

	}

}
