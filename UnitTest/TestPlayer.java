package Testing;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import src.Player;

public class TestPlayer {
	List<Player> player1 = new ArrayList<Player>();
	List<Player> player2 = new ArrayList<Player>();
	List<Player> player3 = new ArrayList<Player>();
	
	public TestPlayer() {
	}
	
	@BeforeClass
	public void setUpClass() {
		Player player_1 = new Player("John", 1);
		Player player_2 = new Player("Sarah", 2);
		player1.add(player_1);
		player2.add(player_2);
		
	}
	@Test
	public void addNew() {
		Player player_3 = new Player("Mary", 3);
		player3.add(player_3);
		assertTrue(player3.contains("Mary"));
	}
	
	@Test
	public void playernoMatch() {
		Player player_3 = new Player("Mary", 3);
		player3.remove(player_3);
		assertFalse(player3.contains("Mary"));
	}

}
