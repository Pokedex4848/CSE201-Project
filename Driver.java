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
		
		//intro statement at game beginning about where you are.
        System.out.println("Welcome to Spook!\nYou are able to move between rooms, and there is a \"look\" command that gives more details about a room. \nYou can also type \"exit\" or \"quit\" to leave the game. \nHave fun!\n\n\nYou wake up in a small room, with a solid wood table to your left and candle siting atop it. \n There is a single door to your north ");

		// Runs the game as long as the user does not enter either "quit" or "exit"
		while(true)
		{
			input = in.nextLine();
			
			if(input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit"))
			{
				break;
			}
			
			player.interpretInput(input);
		}
		
		in.close();
	}
}