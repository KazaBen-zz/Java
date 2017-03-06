package problemsheet2;

/** ItemByWeight.java
 *
 * Subclass of Item, where price is specified by unit weight
 *
 */

public class ItemByWeight extends Item {
	public ItemByWeight(String n, double p, double w) {
		super(n, p);
		weight = w;
	}

	public double getPrice() {
		return weight * super.getPrice();
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return (getName() + " (" + weight + "kg @ " +
			super.getPrice() + "ukp/kg) = ukp" +
			getPrice());
	}
	// Method to check if objects are equal
	public boolean equals(Object otherObject) {
		// Checks superclass equals method
		if (!super.equals(this)) {
			return false;
		// Checks instance, casts otherObject to ItemByWeight, checks instance fields
		} else if (otherObject instanceof ItemByWeight && this.getWeight() == ((ItemByWeight) otherObject).getWeight()) {
			return true;
		} else {
			return false;
		}
	}
	// instance field
	private double weight;
}