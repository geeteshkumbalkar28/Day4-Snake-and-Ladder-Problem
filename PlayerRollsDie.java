 //The Player rolls the die to get a number between 1 to 6. - Use ((RANDOM)) to get the number between 1 to 6
 
import java.util.Random;
 
public class PlayerRollsDie
{
	int playerPosition;
	
	public static void main(String arg[])
	{
		PlayerRollsDie obj = new PlayerRollsDie();
		Random rand = new Random();
		
		int die = rand.nextInt(6);
		obj.playerPosition=(die+1);
		obj.displayPosition();
	}
	private void displayPosition()
	{
		System.out.println("Player current position :"+playerPosition);
	}
}