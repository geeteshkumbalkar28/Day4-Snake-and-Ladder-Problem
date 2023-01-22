//Repeat till the Player reaches the winning position 100. - Note In case the player position
import java.util.*;

class RepeatWinningAfter100
{

	int playerPosition;
	
	public static void main(String arg[])
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("-----------------Welcome to snake and ladder game---------------");
		System.out.println("----------------------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		RepeatWinningAfter100 obj = new RepeatWinningAfter100();
		Random rand = new Random();
		
		while(true)
		{
			System.out.print("Enter do you want to play(yes/no) :");
			String conditionPassFail = scan.nextLine();
			System.out.println();
			boolean bAns; 
			if("yes".equals(conditionPassFail))
			{
				int die = rand.nextInt(6);
				System.out.println("Die No :"+(die+1));
				
				
				obj.playerPosition=(obj.playerPosition)+(die+1);
							
				obj.ladder();
				obj.snake();
				if(obj.playerPosition == 100)
				{
					obj.win();
					System.out.print("Do yo want to play the game again (yes/no):");
					String checkPlayOrNot = scan.nextLine();
					if("yes".equals(checkPlayOrNot))
					{
						obj.playerPosition = 0;
					}
					else if("no".equals(checkPlayOrNot))
					{

						conditionPassFail="exit";
					}
				
				}
				else
				{
					obj.displayPosition();
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
	private void win()
	{
		Scanner scan1 = new Scanner(System.in); 
		
		System.out.println("!!!!!!!!!!! Congratulation You Have Won The Game !!!!!!!!!!!");
		System.out.println();
		
	}
	private void displayPosition()
	{
		System.out.println("Player current position :"+playerPosition);
	}
	public void snake()
	{
		if(playerPosition == 17)
		{
			System.out.println("Snake is bit");
			playerPosition = 7;
		}
		else if(playerPosition == 54)
		{
			System.out.println("Snake is bit");
			playerPosition = 34;
		}
		else if(playerPosition == 64)
		{
			System.out.println("Snake is bit");
			playerPosition = 60;
		}
		else if(playerPosition == 62)
		{
			System.out.println("Snake is bit");
			playerPosition = 19;
		}
		else if(playerPosition == 87)
		{
			System.out.println("Snake is bit");
			playerPosition = 36;
		}
		else if(playerPosition == 93)
		{
			System.out.println("Snake is bit");
			playerPosition = 73;
		}
		else if(playerPosition == 95)
		{
			System.out.println("Snake is bit");
			playerPosition = 75;
		}
		else if(playerPosition == 98)
		{
			System.out.println("Snake is bit");
			playerPosition = 79;
		}
	}
	public void ladder()
	{
		if(playerPosition == 4)
		{
			System.out.println("Ladder has been found");
			playerPosition = 14;
		}
		else if(playerPosition == 9)
		{
			System.out.println("Ladder has been found");
			playerPosition = 31;
		}
		else if(playerPosition == 1)
		{
			System.out.println("Ladder has been found");
			playerPosition = 38;
		}
		else if(playerPosition == 21)
		{
			System.out.println("Ladder has been found");
			playerPosition = 42;
		}
		else if(playerPosition == 28)
		{
			System.out.println("Ladder has been found");
			playerPosition = 84;
		}
		else if(playerPosition == 51)
		{
			System.out.println("Ladder has been found");
			playerPosition = 67;
		}
		else if(playerPosition == 72)
		{
			System.out.println("Ladder has been found");
			playerPosition = 91;
		}
		else if(playerPosition == 80)
		{
			System.out.println("Ladder has been found");
			playerPosition = 99;
		}
	}
}