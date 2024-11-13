import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that controls the Player.
 */
public class Player
{
	private Room currentRoom;
	private ArrayList<String> inventory;
	private Room[] rooms;
	
	/**
	 * Constructor that builds the player class.
	 * 
	 * @param roomNumber The room that the player is in
	 */
	public Player(int roomNumber)
	{
		rooms = new Room[roomNumber];
		inventory = new ArrayList<>();
		
		for(int i = 0; i < roomNumber; i++)
		{
			rooms[i] = new Room(i);
		}
		
		currentRoom = rooms[0];
	}
	
	/**
	 * Interprets the Player's input.
	 * 
	 * @param input The command that the Player entered that they want to run.
	 */
	public void interpretInput(String input)
	{
		if(input.contains("move") || input.contains("traverse") || input.contains("navigate") || input.contains("go"))
		{
			if(input.contains("up") || input.contains("north"))
			{
				move("up");
			}
			else if(input.contains("down") || input.contains("south"))
			{
				move("down");
			}
			else if(input.contains("left") || input.contains("west"))
			{
				move("left");
			}
			else if(input.contains("right") || input.contains("east"))
			{
				move("right");
			}
		}
		else if(input.contains("look") || input.contains("visualize") || input.contains("observe"))
		{
			System.out.println(currentRoom.look());
		}
		else if (input.contains("take") || input.contains("pick up") || input.contains("grab"))
		{
			if(currentRoom.pickUp(input))
			{				
				inventory.add(currentRoom.getItem());
			}
		}
		else if(input.contains("inventory"))
		{
			checkItems();
		}
	}
	
	/**
	 * Checks which items are in the Player's inventory
	 */
	public void checkItems()
	{
		for(String s : inventory)
		{
			System.out.println("\u2022 " + s);
		}
	}

	/**
	 * Command that the player can type in that allows them to move.
	 * 
	 * @param direction The direction that the Player wants to move (up, down, left,
	 *                  right).
	 */
	public void move(String direction)
	{
		if(direction.equals("up"))
		{
			if(currentRoom.getID() == 2)
			{
				currentRoom = rooms[6];
			}
			else if(currentRoom.getID() == 3)
			{
				currentRoom = rooms[4];
			}
			else if(currentRoom.getID() == 0)
			{
				currentRoom = rooms[1];
                System.out.println("The wide atrium you enter has chiseled stone columns and brick archways adorned with porticos containing crumbling statues. \n There is a cobweb-filled hallway to your west and a torch-lit corridor to your east.");

			}
		}
		else if(direction.equals("down"))
		{
			if(currentRoom.getID() == 6)
			{
				currentRoom = rooms[2];
			}
			else if(currentRoom.getID() == 4)
			{
				currentRoom = rooms[3];
			}
			else if(currentRoom.getID() == 1)
			{
				currentRoom = rooms[0];
				System.out.println("You are standing in a small room, with a solid wood table to your left and candle siting atop it. \n There is a door to your north ");
			}
		}
		else if(direction.equals("left"))
		{
			if(currentRoom.getID() == 7)
			{
				currentRoom = rooms[6];
			}
			else if(currentRoom.getID() == 5)
			{
				currentRoom = rooms[4];
			}
			else if(currentRoom.getID() == 2)
			{
				currentRoom = rooms[1];
				System.out.println("The wide atrium you enter has chiseled stone columns and brick archways adorned with porticos containing crumbling statues. \n There is a cobweb-filled hallway to your west and a torch-lit corridor to your east.");
			}
			else if(currentRoom.getID() == 1)
			{
				currentRoom = rooms[3];
			}
		}
		else if(direction.equals("right"))
		{
			if(currentRoom.getID() == 6)
			{
				currentRoom = rooms[7];
			}
			else if(currentRoom.getID() == 4)
			{
				currentRoom = rooms[5];
			}
			else if(currentRoom.getID() == 1)
			{
				currentRoom = rooms[2];
			}
			else if(currentRoom.getID() == 3)
			{
				currentRoom = rooms[1];
                System.out.println("The wide atrium you enter has chiseled stone columns and brick archways adorned with porticos containing crumbling statues. \n There is a cobweb-filled hallway to your west and a torch-lit corridor to your east.");

			}
		}
	}
}