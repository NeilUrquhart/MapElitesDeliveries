package EvolutionaryAlgorithm;

import java.io.File;
import java.util.ArrayList;

import deliveryRoutes.Results;

public class Algorithm {

	public static void main(String[] args){
		File scenarioFile = new File(args[0]);
		Scenario myScenario = Scenario.getInstance();
		myScenario.setup(scenarioFile);
		
		Chromosome ch = new Chromosome(8);
		
		
		
		Results firstres= myScenario.evaluate(ch,true,"");
		
		
		Results oldres = firstres;
		int timeOut = 500;
		while (timeOut >0){
			System.out.println("Evals left " + timeOut);
			Chromosome oldCh = (Chromosome)ch.clone();
			ch.mutate();
			Results res2= myScenario.evaluate(ch,true,"");
			
			if (res2.getEmissions() < oldres.getEmissions()){//improve
				oldres = res2;
				timeOut = 500;
				System.out.println(res2);
				
			}else{
				ch = oldCh;
				timeOut--;
			}
			
		}
		myScenario.evaluate(ch,false,"");
		System.out.println("Final:\n" + oldres);
		
		
	}
}
