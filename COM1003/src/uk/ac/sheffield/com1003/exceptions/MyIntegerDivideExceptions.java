package uk.ac.sheffield.com1003.exceptions;

public class MyIntegerDivideExceptions extends Exception {
	private int y;
	
	public IsZero(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
}
