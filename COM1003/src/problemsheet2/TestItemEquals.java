package problemsheet2;

public class TestItemEquals {

	public static void main(String[] args) {
		// Creating 2 identical ItemByWeight objects
		ItemByWeight weight1 = new ItemByWeight("w", 5, 150);
		ItemByWeight weight2 = new ItemByWeight("w", 5, 150);
		Object book = new Object(); // Random object
		
		// Creating 2 identical Item objects
		Item item1 = new Item("i", 5);
		Item item2 = new Item("i", 5);
		
		Item item3 = new Item("w", 5); // Creating item object different from first two
				
		// Printing out equalities and expectancies
		System.out.println("False expected, Got: " + weight2.equals(item3));
		System.out.println("True expected, Got: " + weight1.equals(weight2));
		System.out.println("False expected, Got: " + weight1.equals(book));
		System.out.println("False expected, Got: " + item3.equals(book));
		System.out.println("True expected, Got: " + item1.equals(item2));
	}
}