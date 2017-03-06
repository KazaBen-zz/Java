package uk.ac.sheffield.com1003.objectville.polymorphism;

public class Test {

	public static void main(String[] args) {
		Animal daisy = new Cow("Daisy");
		Animal fido = new Dog("Fido");
		Animal daisyCopy = daisy;
		Animal fidoCopy = fido;
		daisy.talk();
		daisyCopy.talk();
		fido.talk();
		fidoCopy.talk();
	}
}
