package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import src.Player;

public class WingSpanGame {
	public static void main(String args[]) {
		List<Player> PlayerList = new ArrayList<Player>();
		System.out.println("How many player (0-4)");
		Scanner input = new Scanner(System.in);
		int numPlayers = input.nextInt();
		
		while(true) {
			
		if(numPlayers > 0 && numPlayers <= 4)
		{
			for(int i = 1; i <= numPlayers; i++)
			{
				System.out.println("Enter the name of player " + i);
				String name = input.next();
				int playerNum = i;
				PlayerList.add(new Player(name,playerNum));
				
			}
			break;
		}
		else
		{
			numPlayers = input.nextInt();
		}
		
		}
		Dice Roll = new Dice();
		Roll.RollDice();
		Roll.DisplayDice();
		
		int option;
		Boolean takesTurn = false;
		for(int a = 0; a < 8; a++)
		{
			for(int i = 0; i <= PlayerList.size()-1;i++)
			{
				System.out.println();
				while(takesTurn == false)
				{
					Scanner op = new Scanner(System.in);
					System.out.println(PlayerList.get(i).name+ " choose option: ");
					System.out.println("1: Play Bird Card");
					System.out.println("2: Gain Food");
							option = op.nextInt();
							while (option != 1 && option != 2 && option != 3){
					            System.out.println("You must enter 1 or 2");
					            option = op.nextInt();
					        }
							switch(option)
							{
								case 1:
									if(PlayerList.get(i).Hand.isEmpty())
									{
										System.out.println("No more cards buddy");
										takesTurn = false;
										break;
									}
									else
									{
										System.out.println("Choose card: ");
										PlayerList.get(i).DisplayHand();
										System.out.println(PlayerList.get(i).name + "'s action tokens left : " +  PlayerList.get(i).ActionTokens);
										while(op.hasNext())
										{
											option = op.nextInt();
											if(option < PlayerList.get(i).Hand.size() )
											{
												break;
											}
											else
											{
												continue;
											}
										}
										if(PlayerList.get(i).FoodTokens.contains(PlayerList.get(i).Hand.get(option).TypeOfFood))
										{
											PlayerList.get(i).PlaceBirdCard(option);
											PlayerList.get(i).eggs = PlayerList.get(i).eggs + PlayerList.get(i).GainFoodRow.get(option).egg;
											PlayerList.get(i).FoodTokens.remove(PlayerList.get(i).Hand.get(option).TypeOfFood);
											takesTurn = true;
											PlayerList.get(i).ViewBoard();
										
										}
										else
										{
											System.out.println("Dont have the food to play that bird");
											takesTurn = false;
											
										}
										break;
									}
								
								case 2:
									Roll.DisplayDice();
									int amount = PlayerList.get(i).AmountofFood();
									String yesno;
									if(Roll.CheckIfAllSame()==true)
									{
										System.out.println("ReRoll???? (yes/no)");
										yesno = op.nextLine();
										while (!yesno.equals ("yes") && !yesno.equals ("no")){
								            System.out.println("You must write 'Yes' or 'No'");
								            yesno = op.nextLine();
								        }
										if( yesno.equals("yes"))
										{
											Roll.CurrentDiceRoll.clear();
											Roll.RollDice();
											Roll.DisplayDice();
											
										}
									}
									
									System.out.println("Choose " + amount+ " foods: ");
									for(int k = 0; k < amount; k++)
									{

											while(op.hasNext())
											{
												option = op.nextInt();
												if(option < Roll.CurrentDiceRoll.size() )
												{
													break;
												}
												else
												{
													continue;
												}
											}
											PlayerList.get(i).FoodTokens.add(Roll.CurrentDiceRoll.get(option));
											Roll.CurrentDiceRoll.remove(option);
									}
									
									takesTurn = true;
									break;
								case 3:
									for(int k = 0; k < PlayerList.get(i).GainFoodRow.size();k++)
									{
										System.out.println(PlayerList.get(i).GainFoodRow.get(k).getName());
									}
									break;
									
								default:
									System.out.println("Invalid input, turn nulled");
									takesTurn = false;
									break;
							}
					}
				takesTurn = false;
				}
				
			}
		
		for(int i = 0; i < PlayerList.size();i++)
		{
			System.out.println("Player "+i+" score : "+ PlayerList.get(i).score());
		}
		input.close();
	}
	
		
}
