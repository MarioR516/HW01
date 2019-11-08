package Testing;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import src.Cards;

public class TestGainEggs {
	List<Cards> GainFoodRow = new ArrayList<Cards>();
	int ActionTokens;
	//Player eggs;

	public TestGainEggs() {
	}
	
	@BeforeClass
	public void setUpClass() {
		ActionTokens = 8;
		Cards first = new Cards(1,"Steller's Jay",3,"wetland","Activate");
		Cards second = new Cards(2,"American White Pelican",4,"grassland","Extra egg");
		Cards third = new Cards(3,"Eastern KingBird",6,"Once between turns","Seed");

		GainFoodRow.add(first); 
		GainFoodRow.add(second);
		GainFoodRow.add(third);
		GainFoodRow.remove(first);
		ActionTokens--;
	}
	
	@Test
	public void howManyActionTokens() {
		assertEquals(1, (ActionTokens < 8));
	}

	@Test
	public void testGainFoodRow() {
		
		assertFalse(GainFoodRow.contains("Steller's Jay"));
	}
}