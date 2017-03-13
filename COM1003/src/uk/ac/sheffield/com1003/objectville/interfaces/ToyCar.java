/*
 * ToyCar.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* ToyCar.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.interfaces;

public class ToyCar extends Car 
					implements Toy {
	
	private int ageSuitableFor;
	private boolean battery;
	public ToyCar(int numWheels, int numDoors, int ageSuitableFor,boolean battery) {
		super(numWheels, numDoors);
		this.ageSuitableFor = ageSuitableFor;
		this.battery = battery;
	}
	
	public int getAgeSuitableFor() {
		return ageSuitableFor;
	}
	public String toString(){
		return "age "+ this.getAgeSuitableFor()+" wheels "+ this.getNumWheels()+" doors " + this.getNumDoors();
	}
	public static void main(String args[]){
		ToyCar carry = new ToyCar(4,2,7,true);
		System.out.println(carry);
	}

	public boolean isBatteryPowered() {
		// TODO Auto-generated method stub
		return this.battery;
	}
}



