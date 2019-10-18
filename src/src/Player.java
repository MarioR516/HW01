package src;


import java.util.ArrayList;
import java.util.List;

public class Player {
	String name;
	List<Card> GainFoodRow;
	List<FoodTokens> FoodTokens;//// Food tokens has 5 different types of foods (Should we make a class for Foodtoken?)
	int eggs;
	int ActionTokens;
	int playerNum;//// For putting a number on a player
	public Player(String _name, int _playerNum)
	{
		GainFoodRow = new ArrayList<>();
		name = _name;
		
	}
	public void PlaceBirdCard(ArrayList<Card>) //// Takes the GainFoodRow and places the bird in the next available slot
	{
		
	}
	
	public FoodTokens()//// Returns a foodtoken when you play the action Gain Food on Board.
	{
		switch(this.GainFoodRow.length())
		
	}
	public double score()///Evaluates the score for the player.
	{
		
	}
	public void execute()/// This connects the view or console to this class
	{
		
	}
	
}
