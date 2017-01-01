import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Runner {
	
	public static String userInput;

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the path of your text file to parse or type 'Begin' to "
				+ "to enter actors' information manually");
		
		userInput = scanner.nextLine(); 
		while (!userInput.contains("exit")){
			if (userInput.contains("txt")){
				 Parser newParser = new Parser(userInput);
				 ArrayList<HashMap> actors = newParser.getObjects();
				 for (int object = 0; object < actors.size(); object++) {
					 Actor actor;
					 actor = new Actor(actors.get(object));
					 Production.setProduction(actor);
					} 
				 Production.printAuditionResults();
				 System.exit(0);
			 } else if (userInput.toLowerCase().contains("begin")){
				 System.out.println(
						 	"Enter each actor on one line in this format: name, "
							+ "acting score, vocals score, role (leading man or leading woman), "
							+ "production. For example: Peter Lawn, leading man, 3, 3, The Piper"
							+ "Enter 'done' when finished."
						 );
				 userInput = scanner.nextLine();
				 while (!userInput.contains("done")){
						try { 
						 String [] actorArray = userInput.split(",");
						 HashMap<String,String> actorHash = new HashMap<String, String>();
						 actorHash.put("name", actorArray[0]);
						 actorHash.put("role", actorArray[1]);
						 actorHash.put("actingScore", actorArray[2]);
						 actorHash.put("vocalScore", actorArray[3]);
						 actorHash.put("production", actorArray[4]);
						 Actor actor = new Actor(actorHash);
						 Production.setProduction(actor);	
						} catch (IndexOutOfBoundsException e) {
							System.err.println("Sorry, please enter data in the specified format");
						} 
						userInput = scanner.nextLine();
					} 
				 Production.printAuditionResults();
				 System.exit(0);
			 } else {
				 System.out.println("Please try again or type 'exit' to quit");
			 }
			userInput = scanner.nextLine();
		}	
	}
}
//Example Input:
//"src/Actors.txt"
//Peter Lawn, leading man, 3, 3, The Piper
//Matt Bom, leading man, 4, 5, The Piper
//Dave Reed, leading man, 3, 2, The Piper