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
		if(input.contains("move"))
		{
			if(input.contains("up"))
			{
				move("up");
			}
			else if(input.contains("down"))
			{
				move("down");
			}
			else if(input.contains("left"))
			{
				move("left");
			}
			else if(input.contains("right"))
			{
				move("right");
			}
		}
		else if(input.contains("look"))
		{
			System.out.println(currentRoom.look());
		}
	}
	
	/**
	 * Checks which items are in the Player's inventory
	 */
	public void checkItems()
	{
		
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
			}
		}
	}
}