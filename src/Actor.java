import java.util.HashMap;

public class Actor {
	String name;
	String role;
	int actingScore;
	int vocalScore;
	String production;
	int avgScore;
	
	public Actor(HashMap<String, String> actor){
		name = actor.get("name").trim();
		role = actor.get("role").trim();
		actingScore = Integer.parseInt(actor.get("actingScore").trim());
		vocalScore = Integer.parseInt(actor.get("vocalScore").trim());
		production = actor.get("production").trim();
		avgScore = setAvgScore();
	
	}
	
	public int getAvgScore() {
		return this.avgScore;
	}
	
	public String getProduction() {
		return this.production;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRole() {
		return this.role;
	}
	
	public int setAvgScore() {
		return this.avgScore = (this.vocalScore * this.actingScore) / 2;
	}
	
	
}
