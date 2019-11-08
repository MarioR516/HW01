package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import src.Player;
//
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
					System.out.println("3: Gain Eggs");
					System.out.println("4: Gain Card");
							option = op.nextInt();
							while (option != 1 && option != 2 && option != 3 && option != 4){
					            System.out.println("You must enter 1,2,3, or 4");
					            option = op.nextInt();
					        }
							switch(option)
							{
								case 1:
									if(PlayerList.get(i).Hand.isEmpty())
									{
										System.out.println("No more cards buddy");
										takesTurn = false;
									}
									else
									{
										System.out.println("Choose row:");
										System.out.println("1) Forest");
										System.out.println("2) Grasslands");
										System.out.println("3) Wetlands");
										option = op.nextInt();
										while(option != 1 && option != 2 && option != 3)
										{
											option = op.nextInt();
										}
										switch(option)
										{
											case 1:
												PlayerList.get(i).DisplayHand();
												System.out.println("Choose card: ");
												option = op.nextInt();
												while(option >= PlayerList.get(i).Hand.size())
												{	
													option = op.nextInt();
												}
												if(PlayerList.get(i).Hand.get(option).Habitat == "Forest" && PlayerList.get(i).FoodTokens.contains(PlayerList.get(i).Hand.get(option).TypeOfFood))
												{
													PlayerList.get(i).PutinForest(option);
													takesTurn = true;
												}
												else
												{
													if(PlayerList.get(i).Hand.get(option).Habitat != "Forest")
													{
														System.out.println("Wrong Habitat");
													}
													else
													{
														System.out.println("Not enough food");
													}
													takesTurn = false;
												}
												break;
											case 2:
												PlayerList.get(i).DisplayHand();
												System.out.println("Choose card: ");
												option = op.nextInt();
												while(option >= PlayerList.get(i).Hand.size())
												{	
													option = op.nextInt();
												}
												if(PlayerList.get(i).Hand.get(option).Habitat == "Grassland" && PlayerList.get(i).FoodTokens.contains(PlayerList.get(i).Hand.get(option).TypeOfFood))
												{
													PlayerList.get(i).PutinGrasslands(option);
													takesTurn = true;
												}
												else
												{
													if(PlayerList.get(i).Hand.get(option).Habitat != "Grassland")
													{
														System.out.println("Wrong Habitat");
													}
													else
													{
														System.out.println("Not enough food");
													}
													takesTurn = false;
												}
												break;
											case 3:
												PlayerList.get(i).DisplayHand();
												System.out.println("Choose card: ");
												option = op.nextInt();
												while(option >= PlayerList.get(i).Hand.size())
												{	
													option = op.nextInt();
												}
												if(PlayerList.get(i).Hand.get(option).Habitat == "Wetland" && PlayerList.get(i).FoodTokens.contains(PlayerList.get(i).Hand.get(option).TypeOfFood))
												{
													PlayerList.get(i).PutinWetlands(option);
													takesTurn = true;
												}
												else
												{
													if(PlayerList.get(i).Hand.get(option).Habitat != "Wetland")
													{
														System.out.println("Wrong Habitat");
													}
													else
													{
														System.out.println("Not enough food");
													}
													takesTurn = false;
												}
												break;
										}

									}
									PlayerList.get(i).ViewBoard();
									break;
								case 2:
									Roll.DisplayDice();
									int amount = PlayerList.get(i).AmountofFood();
									String yesno;
									if(Roll.CheckIfAllSame()==true)
									{
										System.out.println("ReRoll???? (yes/no)");
										yesno = op.nextLine();
										while (!yesno.equals ("yes") && !yesno.equals ("no")){
								            System.out.println("You must write 'yes' or 'no'");
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
										///////Needs to be implemented.
								case 4:
									///// Need to be implemented
							}
					}
				takesTurn = false;
				}
				
			}
		
		for(int i = 0; i < PlayerList.size();i++)
		{
			System.out.println("Player "+i+" score : "+ PlayerList.get(i).score());//// Will modify once option 3 and 4 are implemented
		}
		input.close();
	}
	
		
}
