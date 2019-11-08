package src;
import java.util.*;

public class Cards {
		
		//Attributes of a card
		public String name;
		public int egg;
		public int cost;
		public String Habitat;
		public String power;
		public String TypeOfFood;
		
		//Default constructor

		//
		//Constructor that initializes class variables
		Cards()
		{
			
		}
		Cards(int e,String n,int c,String h,String p , String Food){
			this.egg = e;
			this.name = n;
			this.cost = c;
			this.Habitat = h;
			this.power = p;
			TypeOfFood = Food;
		}
		

		 public List<Cards> makeCard(){
			 //int e,String n,int c,char h,String p
			 List<Cards> FiveCards = new ArrayList<Cards>();
			 Cards first = new Cards(1,"Steller's Jay",3,"Wetland","Activate","Invertebrate_Seed");
			 Cards second = new Cards(2,"American White Pelican",4,"Grassland","Extra egg","Fish");
			 Cards third = new Cards(3,"Eastern KingBird",6,"Forest","Once between turns","Seed");
			 Cards fourth = new Cards(4,"Mountain BlueBird",7,"Wetland","Play a second bird","Rodent");
			 Cards fifth = new Cards(5,"American Kestrel",8,"Forest","Roll a dice","Fruit");
			 FiveCards.add(first);
			 FiveCards.add(second);
			 FiveCards.add(third);
			 FiveCards.add(fourth);
			 FiveCards.add(fifth);
			 return FiveCards;
		    }

	}

