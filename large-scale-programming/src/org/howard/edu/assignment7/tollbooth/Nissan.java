/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

/**
 * @author bostic
 *
 */
public class Nissan implements Truck {
	
	private int axles;
	private int weight;

	public Nissan( int axles, int weight) {
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
	
	@Override
	public String toString() {
		return "Axles: " + getAxles() + "Weight: " + getWeight() + "The customer owes: $" + (getAxles() * getWeight()) + " dollars";
	}
	
	public int getCost() {
		return getWeight() * getAxles();
	}
}
