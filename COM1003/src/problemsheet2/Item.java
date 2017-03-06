package problemsheet2;

/** Item.java
 *
 * Model of an item of shopping
 *
 */

public class Item {
	public Item(String n, double p) {
		name = n;
		price = p;
	}

	// methods
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}

	// using ukp to denote pounds sterling as unicode pound does not display
	// properly in MS Command Window
	public String toString() {
		return (name + " = ukp" + price);
	}

	// Method which checks if the objects are equal
	public boolean equals(Object otherObject) {
		// If references are identical return true
		if (otherObject == this) {
			return true;
		// If otherObject is null return false
		} else if (otherObject == null) {
			return false;
		// If classes are different return false
		} else if (otherObject.getClass() != this.getClass()) {
			return false;
		// Casting otherObject to an Item, checking instance, checking instance variables
		} else if (otherObject instanceof Item && ((Item) otherObject).getName() == this.getName() && ((Item) otherObject).getPrice() == this.getPrice()) {
			return true;
		} else {
			return false;
		}
	}

	// instance fields
	private double price;
	private String name;

	public static void main(String[] args) {
		final String TESTNAME = "testObject";
		final double TESTPRICE = 10.0;
		Item testObject = new Item(TESTNAME, TESTPRICE);
		System.out.println("Name:");
		System.out.println("Actual field " + testObject.getName());
		System.out.println("Expected " + TESTNAME);
		System.out.println("Price:");
		System.out.println("Actual field " + testObject.getPrice());
		System.out.println("Expected " + TESTPRICE);
	}
}