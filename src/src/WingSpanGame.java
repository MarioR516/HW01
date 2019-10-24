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
		int option;
		Boolean takesTurn = false;
		for(int a = 0; a < 8; a++)
		{
			for(int i = 0; i <= PlayerList.size()-1;i++)
			{
				while(takesTurn == false)
				{
					Scanner op = new Scanner(System.in);
					System.out.println(PlayerList.get(i).name+ " choose option: ");
					System.out.println("1: Play Bird Card");
					//System.out.println("2: Gain Food");
					
					if(op.hasNextInt())
					{
						option = op.nextInt();
						switch(option)
						{
							case 1:
								System.out.println("Choose card: ");
								PlayerList.get(i).DisplayHand();
								System.out.println(PlayerList.get(i).name + "'s action tokens left : " +  PlayerList.get(i).ActionTokens);
								if(op.hasNextInt())
								{
									option = op.nextInt();
									if(PlayerList.get(i).Hand.isEmpty())
									{
										System.out.println("No more cards buddy");
									}
									else if(option > PlayerList.get(i).Hand.size()-1)
									{
										System.out.println("Enter valid option");

									}
									else
									{
										PlayerList.get(i).PlaceBirdCard(option);
										takesTurn = true;
									}
								}
								else
								{
									System.out.println("Enter valid option");
									i--;
								}
								PlayerList.get(i).ViewBoard();
								break;
							case 2:
								//Roll.DisplayDice();
								for(int g = 0; g < amountOfChoice; g++)
								{
									
								}
				//				PlayerList.get(i).ViewBoard();
				//				break;
							default:
								System.out.println("Invalid input, turn nulled");
								break;
								
						}
					}
					else
					{
						System.out.println("Enter a appropiate option");
						break;
					}
				}
				takesTurn = false;
			}
		}
		
//		for(int i = 0; i < PlayerList.size();i++)
//		{
//			System.out.println("Player "+i+" score : "+ PlayerList.get(i).score());
//		}
		
		
		
		}
}
