package uk.ac.sheffield.com1003.objectville.inheritance;

public class Week2part2 {

	public static void main(String[] args) {
		AstronomicalObject astro = new AstronomicalObject(100);
		AstronomicalObject[] array = new AstronomicalObject[5];
		RedGiant giant1= new RedGiant(1500,50,200000);
		Star star1 = new Star(50,15);
		array[0] = astro;
		array[1] = star1;
		array[2] = giant1;
		RedGiant giant2 =  giant1.makeCopy();
		giant1.printInfo();
		giant2.printInfo();
		System.out.println(giant1.equals(giant2));
	}
}
