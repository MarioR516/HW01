package Testing;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestDice {
	List<String> FoodTokenList;
	
	public void setUp() {
		List<String> FoodTokenList = new ArrayList<String>();
		FoodTokenList.add("Invertebrate");
		//FoodTokenList.add("Seed");
	}
	@Test 
	public void addNew() {
		FoodTokenList.add("Seed");
		assertTrue(FoodTokenList.contains("Seed"));
	}
	
	@Test
	public void addAlreadyThere() {
		FoodTokenList.add("Seed");
		assertEquals(1, FoodTokenList.equals("Seed"));
	}

}
