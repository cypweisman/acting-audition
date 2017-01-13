import static org.junit.Assert.*;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;


public class ActorTest {
	
	private Actor actor;


	@Before
	public void setUp() {
		String line = "Peter Lawn, leading man, 3, 3, The Piper";
		String [] actorArray = line.split(",");
		HashMap<String,String> actorHash = new HashMap<String, String>();
		actorHash.put("name", actorArray[0]);
		actorHash.put("role", actorArray[1]);
		actorHash.put("actingScore", actorArray[2]);
		actorHash.put("vocalScore", actorArray[3]);
	    actorHash.put("production", actorArray[4]);
		
		
		this.actor = new Actor(actorHash);
	}

	@Test
	public void testActor() {
		assertNotNull(actor); 
	}

	@Test
	public void testGetName() {
		assertEquals("Peter Lawn", actor.getName());	
	}

	@Test
	public void testGetRole() {
		assertEquals("leading man", actor.getRole());
	}
	
	@Test
	public void testGetAverageScore() {
		assertEquals(3, actor.getAvgScore());
	}

	@Test
	public void testGetProduction() {
		assertEquals("The Piper", actor.getProduction());
	}
	


}