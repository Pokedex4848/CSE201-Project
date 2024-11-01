import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
	private Room currentRoom;
	private ArrayList<String> inventory;
	private Room[] rooms;
	
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
		} else if (input.contains("take")) {
		    
		}
	}
	
	public void checkItems()
	{
		
	}

	
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