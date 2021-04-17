/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

/**
 * @author bostic
 *
 */
public class Ford implements Truck {
	
	private int axles;
	private int weight;

	public Ford(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}


	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	
	public int getCost() {
		return getWeight() * getAxles();
	}
	
	public String toString() {
		return "Axles: " + getAxles() + "Weight: " + getWeight() + "The customer owes: $" + (getAxles() * getWeight()) + " dollars";
	}
}
