package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
	
	String name;
	public List<String> FoodTokens;//// Food tokens has 5 different types of foods (Should we make a class for Foodtoken?)
	int eggs;
	public int ActionTokens = 8;
	public List<Cards> GainFoodRow;
	public List<Cards> Hand;
	int playerNum;//// For putting a number on a player
	
	public Player(String _name, int _playerNum)
	{
		Hand = new ArrayList<Cards>();
		Cards fiveHand = new Cards();
		//Dice foodTokensStart = new Dice();
		GainFoodRow = new ArrayList<Cards>();
		Hand = fiveHand.makeCard();
		FoodTokens = new ArrayList<>();
		FoodTokens.add("Invertabrate");
		FoodTokens.add("Fish");
		FoodTokens.add("Rodent");
		FoodTokens.add("Seed");
		FoodTokens.add("Fruit");
		FoodTokens.add("Invertebrate_Seed");
		name = _name;
		
		
		
	}
	public void PlaceBirdCard(int choice) //// Takes the GainFoodRow and places the bird in the next available slot
	{
		
		GainFoodRow.add(Hand.get(choice));
		Hand.remove(choice);
		ActionTokens--;
		System.out.println(name + "'s action tokens left : " +  ActionTokens);
		
	}
	public void DisplayHand()
	{
		for(int i = 0; i < Hand.size(); i++)
		{
			System.out.println(i+" : " + Hand.get(i).getName());
		}
	}
	
	public void playFoodTokens()//// Returns a food when you play the action Gain Food on Board.
	{
		switch(GainFoodRow.size())
		{
		case 0:
			
			break;
			
		case 1:
		
			break;
			
		case 2:
			
			break;
		
		case 3:
			
			break;
		
		case 4:
			
			break;
		
		case 5:
			
			break;
		default:
			break;
				
		}
		this.ActionTokens--;
	}
	
	
	
	
	public void ViewBoard()
	{
		System.out.print("Gain Food Row: ");
		for(int i =0; i < GainFoodRow.size();i++)
		{
			System.out.println( "["+ GainFoodRow.get(i).getName()+"]"+ "   ");
		}
		System.out.println();
	}
	public int score()///Evaluates the score for the player.
	{
		return eggs;
	}

	
}
