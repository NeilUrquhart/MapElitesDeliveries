package deliveryRoutes;

import java.io.Serializable;

public class Results implements Serializable{
	private int vehicles;
	private double fixedCost;
	private double runningCost;
	private double emissions;
	private double maxTime;
	private double distance;
	public int getVehicles() {
		return vehicles;
	}
	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}
	public double getFixedCost() {
		return fixedCost;
	}
	public void setFixedCost(double fixedCost) {
		this.fixedCost = fixedCost;
	}
	public double getRunningCost() {
		return runningCost;
	}
	public void setRunningCost(double runningCost) {
		this.runningCost = runningCost;
	}
	public double getEmissions() {
		return emissions;
	}
	public void setEmissions(double emissions) {
		this.emissions = emissions;
	}
	public double getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(double maxTime) {
		this.maxTime = maxTime;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getTotalCost() {
		return this.getFixedCost() + this.getRunningCost();
	}
	
	public String toString(){
		return "Vehicles = " + vehicles +"\n" +
				"Fixed cost = " + fixedCost +"\n" +
				"Running cost = " + runningCost + "\n" +
				"Emissions = " + emissions + "\n" +
				"Max Time = " + maxTime + "\n" +
				"Distance = " + distance +"\n";
		
	}
}
