package uk.ac.sheffield.com1003.problemsheet2;

/** Item.java
*
* Model of an item of shopping
*
*/

  public class Item {
	public Item(String n, double p) {
		name = n; price = p;
		}
	
	// methods
	public String getName() { return name; }
	public double getPrice() { return price; }

	// using ukp to denote pounds sterling as unicode pound does not display
	// properly in MS Command Window
	public String toString() { return (name + " = ukp" + price); }
		
	// equals method to be added here
	public boolean equals(Item item) {
		if(item == this){
			return true;
		}else if(item == null){
			return false;
		}else if(item.getClass() != this.getClass()){
			return false;
		}else if(item.getName() == this.getName() && item.getPrice() == this.getPrice()){
			return true;
		}else{
			return false;
		}
		}
		
	// instance fields
	private double price;
	private String name;
	
	public static void main( String[] args){
		final String TESTNAME = "testObject";
		final double TESTPRICE = 10.0;
		Item testObject = new Item(TESTNAME,TESTPRICE);
		System.out.println("Name:");
		System.out.println("Actual field " + testObject.getName());
		System.out.println("Expected " + TESTNAME);
		System.out.println("Price:");
		System.out.println("Actual field " + testObject.getPrice());
		System.out.println("Expected " + TESTPRICE);
	}
}