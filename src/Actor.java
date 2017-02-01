import java.util.HashMap;

public class Actor {
	String name;
	String role;
	int actingScore;
	int vocalScore;
	String production;
	int avgScore;
	
	public Actor(HashMap<String, String> actor){
		name = setName(actor);
		role = setRole(actor);
		actingScore = setActingScore(actor);
		vocalScore = setVocalScore(actor);
		production = setProduction(actor);
		avgScore = setAvgScore();
	
	}
	
	public String setName(HashMap<String, String> actor) {
		return actor.get("name").trim();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String setRole(HashMap<String, String> actor) {
		return actor.get("role").trim();
	}
	
	public String getRole() {
		return this.role;
	}
	
	public int setActingScore(HashMap<String, String> actor) {
		return Integer.parseInt(actor.get("actingScore").trim());
	}
	
	public int setVocalScore(HashMap<String, String> actor) {
		return Integer.parseInt(actor.get("vocalScore").trim());
	}
	
	public String setProduction(HashMap<String, String> actor) {
		return actor.get("production").trim();
	}
	
	public String getProduction() {
		return this.production;
	}
	
	public int setAvgScore() {
		return this.avgScore = (this.vocalScore * this.actingScore) / 2;
	}
	
	public int getAvgScore() {
		return this.avgScore;
	}
	
	
}
