package src;
import java.io.*;
import java.util.*;

public class Cards {
		
		//Attributes of a card
		String name;
		int egg;
		int cost;
		char habitat;
		String power;
		
		//Default constructor
		Cards(){
		this.name = "Birds";
		this.egg = 2;
		this.cost = 3;
		this.habitat = 'w';
		this.power = "Activate";
		}
		
		//Constructor that initializes class variables
		Cards(int e,String n,int c,char h,String p ){
			this.egg = e;
			this.name = n;
			this.cost = c;
			this.habitat = h;
			this.power = p;
		}
		
		 //Setters
		 public void setEgg(int e) {
			    this.egg = e;
			  }
		 public void setName(String n) {
			    this.name = n;
			  }
		 public void setCost(int c) {
			    this.cost = c;
			  }
		 public void setHabitat(char h) {
			    this.habitat = h;
			  }
		 public void setPower(String p) {
			    this.power = p;
			  }
		 
		 //Getters
		 public int getEgg() {
			    return egg;
			  }
		 public String getName() {
			    return name;
			  }
		 public int getCost() {
			    return cost;
			  }
		 public char getHabitat() {
			    return habitat;
			  }
		 public String getPower() {
			    return power;
			  }
		 
		 public List<Cards> makeCard(){
			 //int e,String n,int c,char h,String p
			 List<Cards> FiveCards = new ArrayList<Cards>();
			 Cards first = new Cards(1,"Steller's Jay",3,'w',"Activate");
			 Cards second = new Cards(2,"American White Pelican",4,'d',"Extra egg");
			 Cards third = new Cards(3,"Eastern KingBird",6,'w',"Once between turns");
			 Cards fourth = new Cards(4,"Mountain BlueBird",7,'d',"Play a second bird");
			 Cards fifth = new Cards(5,"American Kestrel",8,'w',"Roll a dice");
			 FiveCards.add(first);
			 FiveCards.add(second);
			 FiveCards.add(third);
			 FiveCards.add(fourth);
			 FiveCards.add(fifth);
			 return FiveCards;
		    }
		
		//To string method that displays a card
		public String toString(){
		      return "Name: "+ getName() +
		    		 "\nEgg: "+ getEgg() + 
		    		 "\nCost: "+ getCost() +
		    		 "\nHabitat: "+ getHabitat() +
		    		 "\nName: "+ getPower() +"\n\n"
		    		 ;
		    }
	}

