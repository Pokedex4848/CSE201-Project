import java.util.ArrayList;

public class Player
{
	private Room currentRoom;
	private ArrayList<String> inventory = new ArrayList<>();
	private Room[] rooms = new Room[8];
	
	public static void main(String[] args)
	{
		
	}
	
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