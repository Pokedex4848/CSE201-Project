import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		Player player = new Player(8);
		
		Scanner in = new Scanner(System.in);
		
		String input;
		
		//intro statment at game beginning about where you are.
        System.out.println("You are standing in a small room, with a solid wood table to your left and candle siting atop it. \n There is a door to your north ");

		do
		{
			input = in.nextLine();
			player.interpretInput(input);
		}
		while(!input.equalsIgnoreCase("quit"));
		
		in.close();
	}
}