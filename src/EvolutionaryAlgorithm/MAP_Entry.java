package EvolutionaryAlgorithm;

import java.io.Serializable;

import deliveryRoutes.Results;

class MAP_Entry implements Serializable{
	public MAP_Entry(Results r, Chromosome c){
		myResults=r;
		myChromo =c;
	}
	Results myResults;
	Chromosome myChromo;
	int improves;
	String key;
	
	public String toString() {
		return myResults.getVehicles() +"," +myResults.getFixedCost()+","+myResults.getRunningCost()+","+myResults.getEmissions()+","+myResults.getMaxTime()+","+myResults.getDistance();
	}
}
