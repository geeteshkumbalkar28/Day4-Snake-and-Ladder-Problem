//Play the game with 2 Player. In this case if a Player gets a Ladder then plays again. Finally report which Player won the game
//Date = 22-01-2023
//Author

import java.util.*;

public class PlayWithTwoPlayer 
{

	int playerPositionOne; // instance veriable or object veriable
	int playerPositionTwo;// instance veriable or object veriable
	
	public static void main(String arg[])
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("-----------------Welcome to snake and ladder game---------------");
		System.out.println("----------------------------------------------------------------");
		
		// scanner class and Random object is creat 
		Scanner scan = new Scanner(System.in);
		PlayWithTwogitPlayer obj = new PlayWithTwoPlayer();
		Random rand = new Random();
		
		//if the player is play the game single or double
		System.out.println("Do you want to play (single/double) :");
		String checkPlayerSingleOrDouble=scan.nextLine();
		
		//initialization of variable of count the die how many time play to won
		int countDie1=0,countDie2=0;
		
		if("single".equals(checkPlayerSingleOrDouble))
		{
			while(true)
			{
				System.out.print("Enter do you want to play(yes/no) :");
				String conditionPassFail = scan.nextLine();
				System.out.println();
			
			
				if("yes".equals(conditionPassFail))
				{
					int die = rand.nextInt(6);
					System.out.println("Die No :"+(die+1));
				
					if((obj.playerPositionOne + (die+1)) <= 100)
					{
						countDie1++;
						obj.playerPositionOne=(obj.playerPositionOne)+(die+1);
					}
							
					obj.ladder();
					obj.snake(0);
					if(obj.playerPositionOne == 100)
					{
						obj.win(countDie1,0);
						System.out.print("Do yo want to play the game again (yes/no):");
						String checkPlayOrNot = scan.nextLine();
						if("yes".equals(checkPlayOrNot))
						{
							obj.playerPositionOne = 0;
						}
						else if("no".equals(checkPlayOrNot))
						{

							conditionPassFail="exit";
						}
					}
					else
					{
						obj.displayPosition(0);
					}
				}
				else if("no".equals(conditionPassFail))
				{
					System.out.println("Do you want to help(yes/no)");
					String helpSection = scan.nextLine();
				
					if("yes".equals(helpSection))
					{
						System.out.println("do you want to exit the game type (exit) keyword");
						conditionPassFail=scan.nextLine();
					}
				
				}
				if("exit".equals(conditionPassFail))
				{
					System.out.println("!!-------Thank You For Playing This Game--------!!");
					break;
				}
				
			
				System.out.println();
			
			}
		}
		else if("double".equals(checkPlayerSingleOrDouble))
		{
			while(true)
			{
				////////////////////////////////////////PLAYER 1////////////////////////////////
				
				System.out.print("Player1 do you want to play then you say(yes/no) :");
				String conditionPassFail = scan.nextLine();
				System.out.println();
			
				boolean checkLadderFound=false;
				if("yes".equals(conditionPassFail))
				{
					int die = rand.nextInt(6);
					System.out.println("Die No :"+(die+1));
				
					if((obj.playerPositionOne + (die+1)) <= 100)
					{
						countDie1++;
						obj.playerPositionOne=(obj.playerPositionOne)+(die+1);
					}
							
					checkLadderFound=obj.ladder(1);
					obj.snake(1);
					if(obj.playerPositionOne == 100)
					{
						obj.win(countDie1,1);
						System.out.print("Do yo want to play the game again (yes/no):");
						String checkPlayOrNot = scan.nextLine();
						if("yes".equals(checkPlayOrNot))
						{
							obj.playerPositionOne = 0;
						}
						else if("no".equals(checkPlayOrNot))
						{

							conditionPassFail="exit";
						}
					}
					else
					{
						obj.displayPosition(1);
					}
					
				System.out.println();
			
				
				// if the Player gets a Ladder then plays again .
					while(checkLadderFound == true)
					{
						System.out.print("Player1 do you want to play then you say(yes/no) :");
						conditionPassFail = scan.nextLine();
						System.out.println();
				
						checkLadderFound=false;
						if("yes".equals(conditionPassFail))
						{
							rand.nextInt(6);
							System.out.println("Die No :"+(die+1));
						
							if((obj.playerPositionOne + (die+1)) <= 100)
							{
								countDie1++;
								obj.playerPositionOne=(obj.playerPositionOne)+(die+1);
							}
									
							checkLadderFound=obj.ladder(1);
							obj.snake(1);
							if(obj.playerPositionOne == 100)
							{
								obj.win(countDie1,1);
								System.out.print("Do yo want to play the game again (yes/no):");
								String checkPlayOrNot = scan.nextLine();
								if("yes".equals(checkPlayOrNot))
								{
									obj.playerPositionOne = 0;
								}
								else if("no".equals(checkPlayOrNot))
								{

									conditionPassFail="exit";
								}
							}
							else
							{
								obj.displayPosition(1);
							}
						}
						
				System.out.println();
			
					}
				}
				else if("no".equals(conditionPassFail))
				{
					System.out.println("Do you want to help(yes/no)");
					String helpSection = scan.nextLine();
				
					if("yes".equals(helpSection))
					{
						System.out.println("do you want to exit the game type (exit) keyword");
						conditionPassFail=scan.nextLine();
					}
				
				}
				if("exit".equals(conditionPassFail))
				{
					System.out.println("!!-------Thank You For Playing This Game--------!!");
					break;
				}
				
				
				///////////////////////////////////////////PLAYER 2///////////////////////////////
				
				System.out.print("Player2 do you want to play then you say(yes/no) :");
				conditionPassFail = scan.nextLine();
				System.out.println();
				checkLadderFound=false;
			
				if("yes".equals(conditionPassFail))
				{
					int die = rand.nextInt(6);
					System.out.println("Die No :"+(die+1));
				
					if((obj.playerPositionTwo + (die+1)) <= 100)
					{
						countDie2++;
						obj.playerPositionTwo=(obj.playerPositionTwo)+(die+1);
					}
							
					checkLadderFound=obj.ladder(2);
					obj.snake(2);
					if(obj.playerPositionTwo == 100)
					{
						obj.win(countDie2,2);
						System.out.print("Do yo want to play the game again (yes/no):");
						String checkPlayOrNot = scan.nextLine();
						if("yes".equals(checkPlayOrNot))
						{
							obj.playerPositionTwo = 0;
						}
						else if("no".equals(checkPlayOrNot))
						{

							conditionPassFail="exit";
						}
					}
					else
					{
						obj.displayPosition(2);
					}
					
				System.out.println();
			
					// if the Player gets a Ladder then plays again .
					while(checkLadderFound == true)
					{
						System.out.print("Player2 do you want to play then you say(yes/no) :");
						conditionPassFail = scan.nextLine();
						System.out.println();
						checkLadderFound=false;
					
						if("yes".equals(conditionPassFail))
						{
							rand.nextInt(6);
							System.out.println("Die No :"+(die+1));
						
							if((obj.playerPositionTwo + (die+1)) <= 100)
							{
								countDie2++;
								obj.playerPositionTwo=(obj.playerPositionTwo)+(die+1);
							}
									
							checkLadderFound=obj.ladder(2);
							obj.snake(2);
							if(obj.playerPositionTwo == 100)
							{
								obj.win(countDie2,2);
								System.out.print("Do yo want to play the game again (yes/no):");
								String checkPlayOrNot = scan.nextLine();
								if("yes".equals(checkPlayOrNot))
								{
									obj.playerPositionTwo = 0;
								}
								else if("no".equals(checkPlayOrNot))
								{

									conditionPassFail="exit";
								}
							}
							else
							{
								obj.displayPosition(2);
							}
						}
						
					System.out.println();
			
					}
					
			
				}
				else if("no".equals(conditionPassFail))
				{
					System.out.println("Do you want to help(yes/no)");
					String helpSection = scan.nextLine();
				
					if("yes".equals(helpSection))
					{
						System.out.println("do you want to exit the game type (exit / no) keyword");
						conditionPassFail=scan.nextLine();
					}
				
				}
				//if the will be not play then he/she can quit the game
				if("exit".equals(conditionPassFail))
				{
					System.out.println("!!-------Thank You For Playing This Game--------!!");
					break;
				}
				
			
				System.out.println();
			
			}
		}
		else
		{
			System.out.println("Enter the valid input(single/double)");
		}
	}
	/////////////////////////////////////////////////////////////////////
	//
	//  Function Name :  win	
	//  Description   :  Used to Display the which player won and display the count of die to won
	//  Input         :  Integer,Integer
	//  Output        :  void
	//  Date 		  :  22/01/2023
	//  Author 		  :  Geetesh Gajanan Kumbalkar
	//
	/////////////////////////////////////////////////////////////////////

	private void win(int count,int player)
	{
		
		if(player == 0)
		{
			System.out.println("The dice was played to win the game :"+count);
			System.out.println("!!!!!!!!!!! Congratulation you Have Won The Game !!!!!!!!!!!");
		}
	
		else if(player == 1)
		{
			System.out.println("The dice was played to win the game :"+count);
			System.out.println("!!!!!!!!!!! Congratulation Player1 Have Won The Game !!!!!!!!!!!");
		}
		else if(player == 2)
		{
			System.out.println("The dice was played to win the game :"+count);
			System.out.println("!!!!!!!!!!! Congratulation Player1 Have Won The Game !!!!!!!!!!!");
		}
		System.out.println();
		
	}
	/////////////////////////////////////////////////////////////////////
	//
	//  Function Name :  displayPosition	
	//  Description   :  Used to Display the current position
	//  Input         :  Integer
	//  Output        :  void
	//  Date 		  :  22/01/2023
	//  Author 		  :  Geetesh Gajanan Kumbalkar
	//
	/////////////////////////////////////////////////////////////////////

	private void displayPosition(int player)
	{
		if(player == 0)
		{
			System.out.println("Player current position :"+playerPositionOne);
		}
		else if(player == 1)
		{
			System.out.println("Player1 current position :"+playerPositionOne);
		}
		else if(player == 2)
		{
			System.out.println("Player2 current position :"+playerPositionTwo);
		}
		
		
	}
	/////////////////////////////////////////////////////////////////////
	//
	//  Function Name :  snake	
	//  Description   :  Used to snake is bit or not  
	//  Input         :  Integer
	//  Output        :  void
	//  Date 		  :  22/01/2023
	//  Author 		  :  Geetesh Gajanan Kumbalkar
	//
	/////////////////////////////////////////////////////////////////////

	public void snake(int player)
	{
		if(player == 0)
		{
			if(playerPositionOne == 17)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 7;
			}
			else if(playerPositionOne == 54)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 34;
			}
			else if(playerPositionOne == 64)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 60;
			}
			else if(playerPositionOne == 62)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 19;
			}
			else if(playerPositionOne == 87)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 36;
			}
			else if(playerPositionOne == 93)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 73;
			}
			else if(playerPositionOne == 95)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 75;
			}
			else if(playerPositionOne == 98)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 79;
			}
			
		}
		else if(player == 1)
		{
			if(playerPositionOne == 17)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 7;
			}
			else if(playerPositionOne == 54)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 34;
			}
			else if(playerPositionOne == 64)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 60;
			}
			else if(playerPositionOne == 62)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 19;
			}
			else if(playerPositionOne == 87)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 36;
			}
			else if(playerPositionOne == 93)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 73;
			}
			else if(playerPositionOne == 95)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 75;
			}
			else if(playerPositionOne == 98)
			{
				System.out.println("Snake is bit");
				playerPositionOne = 79;
			}
		}
		else if(player == 2)
		{
			if(playerPositionTwo == 17)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 7;
			}
			else if(playerPositionTwo == 54)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 34;
			}
			else if(playerPositionTwo == 64)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 60;
			}
			else if(playerPositionTwo == 62)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 19;
			}
			else if(playerPositionTwo == 87)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 36;
			}
			else if(playerPositionTwo == 93)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 73;
			}
			else if(playerPositionTwo == 95)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 75;
			}
			else if(playerPositionTwo == 98)
			{
				System.out.println("Snake is bit");
				playerPositionTwo = 79;
			}
		}
	}
	public void ladder()
	{
		if(playerPositionOne == 4)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 14;
				
			}
			else if(playerPositionOne == 9)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 31;
			}
			else if(playerPositionOne == 1)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 38;
			}
			else if(playerPositionOne == 21)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 42;
			}
			else if(playerPositionOne == 28)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 84;
			}
			else if(playerPositionOne == 51)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 67;
			}
			else if(playerPositionOne == 72)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 91;
			}
			else if(playerPositionOne == 80)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 99;
			}
		
	}
	/////////////////////////////////////////////////////////////////////
	//
	//  Function Name :  ladder
	//  Description   :  Used to Ladder has been found or not
	//  Output        :  void
	//  Date 		  :  22/01/2023
	//  Author 		  :  Geetesh Gajanan Kumbalkar
	//
	/////////////////////////////////////////////////////////////////////

	public boolean ladder(int player)
	{
		boolean flag=false;
		
		if( player == 1)
		{
			if(playerPositionOne == 4)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 14;
				flag=true;
			}
			else if(playerPositionOne == 9)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 31;
				flag= true;
			}
			else if(playerPositionOne == 1)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 38;
				flag= true;
			}
			else if(playerPositionOne == 21)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 42;
				flag= true;
			}
			else if(playerPositionOne == 28)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 84;
				flag= true;
			}
			else if(playerPositionOne == 51)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 67;
				flag= true;
			}
			else if(playerPositionOne == 72)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 91;
				flag= true;
			}
			else if(playerPositionOne == 80)
			{
				System.out.println("Ladder has been found");
				playerPositionOne = 99;
				flag= true;
			}
		}
		else if( player == 2)
		{
			if(playerPositionTwo == 4)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 14;
				flag= true;
			}
			else if(playerPositionTwo == 9)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 31;
				flag= true;
			}
			else if(playerPositionTwo == 1)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 38;
				flag= true;
			}
			else if(playerPositionTwo == 21)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 42;
				flag= true;
			}
			else if(playerPositionTwo == 28)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 84;
				flag= true;
			}
			else if(playerPositionTwo == 51)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 67;
				flag= true;
			}
			else if(playerPositionTwo == 72)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 91;
				flag= true;
			}
			else if(playerPositionTwo == 80)
			{
				System.out.println("Ladder has been found");
				playerPositionTwo = 99;
				flag= true;
			}
		}
		return flag;
	}
}