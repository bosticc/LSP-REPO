package org.howard.edu.assignment7.tollbooth;

import java.util.ArrayList;

public class AlleghenyTollBooth implements TollBooth {
	
	private ArrayList<Truck> allTrucks= new ArrayList<Truck>();

	@Override
	public int calculateToll(Truck truck) {
		allTrucks.add(truck);
		int totalCost = truck.getAxles() * 5 + (truck.getWeight()/200);
		System.out.println("Truck arrival - Axles: " + truck.getAxles() + " Total weight: " + truck.getWeight()+ "Toll due: $" + totalCost);
		return totalCost;
	}

	@Override
	public void reset() {
		System.out.println(allTrucks);
		allTrucks.clear();
	}


	@Override
	public void displayData() {
		int totalCost = 0;
		for(Truck truck: allTrucks) {
			totalCost += truck.getCost();
		}
		System.out.println("***Collecting receipts***");
		System.out.println("Total since last collection - Receipts: $" + totalCost + "Trucks: " + allTrucks.size());
	}
	
	public String toString() {
		int totalCost = 0;
		for(Truck truck: allTrucks) {
			totalCost += truck.getCost();
		}
		System.out.println("***Collecting receipts***");
		System.out.println("Total since last collection - Receipts: $" + totalCost + "Trucks: " + allTrucks.size());
		return "***Collecting receipts*** Total since last collection - Receipts: $"  + totalCost + "Trucks:" + allTrucks.size();
	}
}

