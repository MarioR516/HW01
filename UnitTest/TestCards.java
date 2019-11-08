package Testing;

import org.junit.BeforeClass;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import src.Cards;

public class TestCards {
	List<Cards> firstcard = new ArrayList<Cards>();
	List<Cards> secondcard = new ArrayList<Cards>();
	List<Cards> thirdcard = new ArrayList<Cards>();
	
	public TestCards() {

	}
	
	@BeforeClass
	public void setUpClass() {		
		Cards card_1 = new Cards(1,"Steller's Jay",3,'w',"Activate","Invertebrate_Seed");
		Cards card_2 = new Cards(2,"American White Pelican",4,'d',"Extra egg","Fish");
		Cards card_3 = new Cards(3,"Eastern KingBird",6,'w',"Once between turns","Seed");
		firstcard.add(card_1);
		secondcard.add(card_2);
		thirdcard.add(card_3);

	}

	@Test
	public void cardsMatch() {
		assertEquals(1, first2cards(firstcard, secondcard));
	}
	
	@Test
	public void cardsnotMatch() {
		assertEquals(2, first2cards(firstcard, secondcard));
	}
	
	public int first2cards(List<Cards> card1, List<Cards> card2) {
		for (int i = 0; i < card1.size(); i++) {
			if (card1.get(i).equals(card2.get(i)))
				return i;
		}
		return card1.size();
	}


}
