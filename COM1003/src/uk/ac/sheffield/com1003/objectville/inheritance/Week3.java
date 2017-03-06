package uk.ac.sheffield.com1003.objectville.inheritance;

public class Week3 {

	public static void main(String[] args) {
		AstronomicalObject[] array = {
			new Star(100,500),
			new Star(500,100),
			new RedGiant(100,500,3500),
			new RedGiant(4455,688668,6555),
			new AstronomicalObject(500),
		};
		for(int i=0;i<array.length;i++){
			array[i].printInfo();
		}

	}

}
