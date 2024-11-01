import java.util.Scanner;

public class Driver
{
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