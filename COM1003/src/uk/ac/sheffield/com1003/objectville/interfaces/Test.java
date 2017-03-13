package uk.ac.sheffield.com1003.objectville.interfaces;

/**
 * @author Benas
 *
 */
/**
 * @author Benas
 *
 */
/**
 * @author Benas
 *
 */
public class Test {
	public static void main(String args[]){
		ToyCar toycar = new ToyCar(2,4,6,false);
		Toy toy = new ToyCar(1,3,5,true);
		Car car = new ToyCar(4,8,16,true);
		System.out.println(toycar.getNumWheels());
		System.out.println(toycar.getAgeSuitableFor());
		System.out.println(toy.getAgeSuitableFor());
		car.getNumDoors();
	}
}
