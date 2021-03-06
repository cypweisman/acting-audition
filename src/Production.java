import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;

public class Production {

	 public static HashMap<String, ArrayList<Actor>>
	 productions = new HashMap<String, ArrayList<Actor>>();
	 
	 public static void setProduction(Actor actor) {
			if (productions.containsKey(actor.getProduction())) {
				productions.get(actor.getProduction()).add(actor);
			} else {
				ArrayList<Actor> productionActors = new ArrayList<Actor>();
				productionActors.add(actor);
			   productions.put(actor.getProduction(), productionActors);

			}
	 }
	 
	 public static void printAuditionResults() {
		 
		for (String production: productions.keySet()) {
		
			ArrayList<Actor> actorArray = productions.get(production);
			ArrayList<String> leadMan = new ArrayList<String>();
			int leadManScore = 0;
			ArrayList<String> leadWoman = new ArrayList<String>();
			int leadWomanScore = 0;
			
			System.out.println("Production: " + production); 
			
			for (int i = 0; i < actorArray.size(); i++){
				Actor givenActor = actorArray.get(i);
				if (givenActor.getRole().contains("leading man")){
				
					if (givenActor.getAvgScore() > leadManScore) {
						leadMan.clear();
						leadMan.add(givenActor.getName());
						leadManScore = givenActor.getAvgScore();
					} else if (givenActor.getAvgScore() == leadManScore){
						leadMan.add(givenActor.getName());
					}
				
				} else {
				
					if (givenActor.getAvgScore() > leadWomanScore) {
						leadWoman.clear();
						leadWoman.add(givenActor.getName());
						leadWomanScore = givenActor.getAvgScore();
					} else if (givenActor.getAvgScore() == leadManScore){
						leadWoman.add(givenActor.getName());
					}
				}
				
			}

			System.out.println(" --Leading Man-- ");
			if (leadMan.size() > 1){
				System.out.println("Tie between: ");
			}
			System.out.print("");
			for (int m = 0; m < leadMan.size(); m++){
					System.out.print(" " + leadMan.get(m) + " ");
			}
			System.out.println("");
				
			
			System.out.println(" --Leading Woman-- ");
			if (leadWoman.size() > 1){
				System.out.println("Tie between: ");
			}
			System.out.print("");
			for (int w = 0; w < leadWoman.size(); w++){
					System.out.print(" " + leadWoman.get(w) + " ");
			}
			System.out.println("");
			System.out.println("");
			
		}
	 
	 }
		
}