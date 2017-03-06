package uk.ac.sheffield.com1003.exceptions;
import uk.ac.sheffield.com1003.EasyReader;


public class MyIntegerDivide {
	
		public static int readDigit() throws isZero {
			EasyReader r = new EasyReader();
			int y = r.readInt();
			if (y<0) {
				throw new isZero(y);
			}
			return y;
		}
	
	public static void main(String[] args) {
		EasyReader read = new EasyReader();
		try{
			System.out.println("Enter number");
			int y = readDigit();
			System.out.println(Math.sqrt(y));
			
		} catch(isZero e){
			System.out.println(" is negative.");
		}
	}

}
