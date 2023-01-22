//Snake and Ladder game played with single player at start position 0


public class SnakeLadderStartPosition
{
	int playerPosition;
	
	public static void main(String arg[])
	{
		SnakeLadderStartPosition obj = new SnakeLadderStartPosition();
		obj.playerPosition = 0;
		obj.displayPosition();
	}
	private void displayPosition()
	{
		System.out.println("Player current position :"+playerPosition);
	}
}