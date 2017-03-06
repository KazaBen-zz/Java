package problemsheet2;

public class TestItemPoly {

	public static void main(String[] args) {
		// Creating array of Item elements
		Item[] shopping = {
			new Item("baked beans", 0.3),
			new ItemByWeight("bananas", 0.4, 0.7),
			new Item("coke", 1),
			new ItemByWeight("berries", 0.5, 5),
		};
		// Printing out details of the objects' which are in the same array
		for (int i = 0; i < shopping.length; i++) {
			System.out.println(shopping[i]);
		}
	}

}