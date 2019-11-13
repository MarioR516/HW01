package src;
import java.io.*;
import java.util.*;

public class Cards {
		
		//Attributes of a card
		String name;
		int egg;
		int cost;
		String habitat;
		String power;
		
		//Default constructor
		Cards(){
		this.name = "Birds";
		this.egg = 2;
		this.cost = 3;
		this.habitat = "wetland";
		this.power = "Activate";
		}
		
		//Constructor that initializes class variables
		Cards(int e,String n,int c,String h,String p ){
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
		 public void setHabitat(String h) {
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
		 public String getHabitat() {
			    return habitat;
			  }
		 public String getPower() {
			    return power;
			  }
		 
		 public Cards[] makeCard(){
			 //int e,String n,int c,String h,String p
			 Cards first = new Cards(1,"Steller's Jay",3,"wetland","Activate");
			 Cards second = new Cards(2,"American White Pelican",4,"grassland","Extra egg");
			 Cards third = new Cards(3,"Eastern KingBird",6,"wetland","Once between turns");
			 Cards fourth = new Cards(4,"Mountain BlueBird",7,"forest","Play a second bird");
			 Cards fifth = new Cards(5,"American Kestrel",8,"grassland","Roll a dice");
			 
			 Cards[] A = new Cards[]{first,second,third,fourth,fifth};
			 
			 return A;
		    }
		 
		 public Cards[] makeDeck() {
			 int num = 0;
			 int i = 0;
			 Cards temp;
			 Cards[] deck;
			 Scanner n = new Scanner(System.in);
			 Scanner sc;
			 try {
					 sc = new Scanner(new File("cardTextFile.txt"));
			 }
			 catch(Exception e) {
				 System.out.print("Cant find file");
			 }
	
			 System.out.print("How many cards do you want");
		        num = n.nextInt();
		        deck = new Cards[num];
		        
			 while(sc.hasNext() && i<num) {
				 int eg = sc.nextInt();
				 String nme = sc.next();
				 int cst = sc.nextInt();
				 String hbtat = sc.next();
				 String pwr = sc.next();
				 temp = new Cards(eg,nme,cst,hbtat,pwr);
				 deck[i] = temp;
				 i++;
			 }
			 sc.close(); 
			 n.close();
			 return deck;
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

