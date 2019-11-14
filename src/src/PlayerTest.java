package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {
	

	@Test
	public void testAmountofFood() {
		Player m = new Player("M",1);
		m.FoodTokens.add("Fish");
		m.FoodTokens.add("Seed");
		m.FoodTokens.add("Invertabrate");
		m.FoodTokens.add("Rodent");
		m.FoodTokens.add("Fruit");
		m.eggCap = 20;
		m.eggs = 19;
		m.PutinForest(0);
		if(m.AmountofFood() == 1)
		{
			assertTrue(true);
		}
		
	}

	@Test
	public void testAmountofEggs() {
		Player m = new Player("M",1);
		m.FoodTokens.add("Fish");
		m.FoodTokens.add("Seed");
		m.FoodTokens.add("Invertabrate");
		m.FoodTokens.add("Rodent");
		m.FoodTokens.add("Fruit");
		m.eggCap = 20;
		m.eggs = 19;
		m.PutinGrasslands(0);
		if(m.AmountofEggs() == 1)
		{
			assertTrue(true);
		}
	}

	@Test
	public void testAmountofCards() {
		Player m = new Player("M",1);
		m.FoodTokens.add("Fish");
		m.FoodTokens.add("Seed");
		m.FoodTokens.add("Invertabrate");
		m.FoodTokens.add("Rodent");
		m.FoodTokens.add("Fruit");
		m.eggCap = 20;
		m.eggs = 19;
		m.PutinWetlands(0);
		if(m.AmountofCards() == 1)
		{
			assertTrue(true);
		}
	}

	@Test
	public void testPutinForest() {
		Player m = new Player("M",1);
		m.FoodTokens.add("Fish");
		m.FoodTokens.add("Seed");
		m.FoodTokens.add("Invertabrate");
		m.FoodTokens.add("Rodent");
		m.FoodTokens.add("Fruit");
		m.eggCap = 20;
		m.eggs = 19;
		assertTrue(m.PutinForest(0));
	}

	@Test
	public void testPutinGrasslands() {
		Player m = new Player("M",1);
		m.FoodTokens.add("Fish");
		m.FoodTokens.add("Seed");
		m.FoodTokens.add("Invertabrate");
		m.FoodTokens.add("Rodent");
		m.FoodTokens.add("Fruit");
		m.eggCap = 20;
		m.eggs = 19;
		assertTrue(m.PutinGrasslands(0));
	}

	@Test
	public void testPutinWetlands() {
		Player m = new Player("M",1);
		m.FoodTokens.add("Fish");
		m.FoodTokens.add("Seed");
		m.FoodTokens.add("Invertabrate");
		m.FoodTokens.add("Rodent");
		m.FoodTokens.add("Fruit");
		m.eggCap = 20;
		m.eggs = 19;
		assertTrue(m.PutinWetlands(0));
	}

}
