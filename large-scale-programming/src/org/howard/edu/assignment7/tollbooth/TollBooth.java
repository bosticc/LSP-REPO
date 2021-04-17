package org.howard.edu.assignment7.tollbooth;

import java.util.ArrayList;

public interface TollBooth {
	public int calculateToll(Truck truck);
	public void reset();
	public void displayData();
	public String toString();
}
