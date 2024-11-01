import java.util.Scanner;

/**
 * Class that runs the game's main method.
 */
public class Driver
{
	/*
	 * The main method
	 */
	public static void main(String[] args)
	{
		Player player = new Player(8);
		
		Scanner in = new Scanner(System.in);
		
		String input;
		
		do
		{
			input = in.nextLine();
			player.interpretInput(input);
		}
		while(!input.equalsIgnoreCase("quit"));
		
		in.close();
	}
}