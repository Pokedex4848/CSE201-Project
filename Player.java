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
	private Door[] doors;
	
	/**
	 * Constructor that builds the player class.
	 * 
	 * @param roomNumber The room that the player is in
	 */
	public Player(int roomNumber)
	{
		rooms = new Room[roomNumber];
		doors = new Door[2];
		doors[0] = new Door(0, "Rusty Key");
		doors[1] = new Door(1, "Golden Key");
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
		input = input.toLowerCase();
		
		// Interprets input to call the move method to move the user
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
		// Interprets the input to call the look method to look around a room
		else if(input.contains("look") || input.contains("visualize") || input.contains("observe"))
		{
			System.out.println(currentRoom.look());
		}
		// Interprets the input to call the pickUp method to pick up an item in the room
		else if (input.contains("take") || input.contains("pick up") || input.contains("grab"))
		{
			if(currentRoom.pickUp(input))
			{				
				inventory.add(currentRoom.getItem());
			}
		}
		// Interprets the input to call the checkItems method to check the items in the
		// user's inventory
		else if(input.contains("inventory") || input.contains("items"))
		{
			checkItems();
		}
		// Interprets the input to call the openDoor method to open doors in a room
		else if(input.contains("unlock") || input.contains("open"))
		{
			// Runs if the Rusty Key is in the room
			if(currentRoom.getID() == 4 && inventory.contains("Rusty Key"))
			{
				if(!doors[0].isOpen())
				{
					doors[0].openDoor("Rusty Key");
					System.out.println("Unlocked door");
				}
				else
				{
					System.out.println("This door has already been unlocked!");
				}
			}
			// Runs if the Golden Key is in the room
			else if(currentRoom.getID() == 6 && inventory.contains("Golden Key"))
			{
				if(!doors[1].isOpen())
				{
					doors[1].openDoor("Golden Key");
					System.out.println("Unlocked door");
				}
				else
				{
					System.out.println("This door has already been unlocked!");
				}
			}
		}
		// Interpret input that allows the user to climb a ladder in order to reach a
		// key if they have the materials to fix it.
		else if(input.contains("ladder") && (input.contains("fix") || input.contains("repair")))
		{
			if(currentRoom.getID() == 5)
			{
				if(inventory.contains("Wood Plank"))
				{
					inventory.remove("Wood Plank");
					System.out.println("You can now climb the ladder. Atop sits a shining, golden key.");
					currentRoom.togglePickUp();
				}
				else
				{
					System.out.println("You don't seem to have the right item...");
				}
			}
			else
			{
				System.out.println("This is not the right room for that.");
			}
		}
		// Runs if the method can't interpret a command entered by the user
		else
		{
			System.out.println("I do not recognize this command.");
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
		// Moves the character north and gives them either a short description of the
		// room they entered or tells them they cannot move in that direction
		if(direction.equals("up"))
		{
			if(currentRoom.getID() == 2)
			{
				currentRoom = rooms[6];
				System.out.println("Wind blows through this corridor through steel grates along the floor. \n There are entrances to your east and south");
			}
			else if(currentRoom.getID() == 3)
			{
				currentRoom = rooms[4];
				System.out.println("This hallway is barren except for braziers placed along the walls. \n There is a door to your east and south");
			}
			else if(currentRoom.getID() == 0)
			{
				currentRoom = rooms[1];
                System.out.println("The wide atrium you enter has chiseled stone columns and brick archways adorned with porticos containing crumbling statues. \n There is a cobweb-filled hallway to your west and a torch-lit corridor to your east.");
			}
			else
			{
				System.out.println("You can't move in this direction.");
			}
		}
		// Moves the character south and gives them either a short description of the
		// room they entered or tells them they cannot move in that direction
		else if(direction.equals("down"))
		{
			if(currentRoom.getID() == 6)
			{
				currentRoom = rooms[2];
				System.out.println("The room you enter is cast in light from a central brazier, and the walls are made of laid stone. \n There is a door to your north and west.");
			}
			else if(currentRoom.getID() == 4)
			{
				currentRoom = rooms[3];
				System.out.println("Steaming pipes spiderweb the walls, and a mahogany desk sits in the corner. \n There is a passage to your north and east");
			}
			else if(currentRoom.getID() == 1)
			{
				currentRoom = rooms[0];
				System.out.println("You are standing in the room you awoke in, with a solid wood table to your left and candle siting atop it. \n There is a door to your north ");
			}
			else
			{
				System.out.println("You can't move in this direction.");
			}
		}
		// Moves the character west and gives them either a short description of the
		// room they entered or tells them they cannot move in that direction
		else if(direction.equals("left"))
		{
			if(currentRoom.getID() == 7)
			{
				currentRoom = rooms[6];
                System.out.println("Wind blows through this corridor through steel grates along the floor. \n There are entrances to your east and south");
			}
			else if(currentRoom.getID() == 5)
			{
				currentRoom = rooms[4];
                System.out.println("This hallway is barren except for braziers placed along the walls. \n There is a door to your east and south");
			}
			else if(currentRoom.getID() == 2)
			{
				currentRoom = rooms[1];
				System.out.println("The wide atrium you enter has chiseled stone columns and brick archways adorned with porticos containing crumbling statues. \n There is a cobweb-filled hallway to your west and a torch-lit corridor to your east.");
			}
			else if(currentRoom.getID() == 1)
			{
				currentRoom = rooms[3];
                System.out.println("Steaming pipes spiderweb the walls, and a mahogany desk sits in the corner. \n There is a passage to your north and east");
			}
			else
			{
				System.out.println("You can't move in this direction.");
			}
		}
		// Moves the character east and gives them either a short description of the
		// room they entered or tells them they cannot move in that direction
		else if(direction.equals("right"))
		{
			if(currentRoom.getID() == 6)
			{
				if(doors[1].isOpen())
				{
					currentRoom = rooms[7];
					System.out.println("As you enter the room, industrial lighting shines down on you. \n The back of the room contains an elevator, which leads you to the outside world.");
					
					//May change depending on whether we want the game to exit as soon as the player enters, or require them to actually enter the elevator first.
					System.out.println("\n\nYou have escaped the dark and mysterious basement and are now free. Congratulations!");
					System.exit(0);
				}
				else
				{
					System.out.println("The door to this room is locked with an ornate golden lock.");
				}
			}
			else if(currentRoom.getID() == 4)
			{
				if(doors[0].isOpen())
				{
					currentRoom = rooms[5];
					System.out.println("Wood paneling covers the walls, and a bookshelf with an attached ladder is in the corner. \n There is a door to your west where you emerged.");
				}
				else
				{
					System.out.println("The door to this room is locked with a rusty lock.");
				}
			}
			else if(currentRoom.getID() == 1)
			{
				currentRoom = rooms[2];
                System.out.println("The room you enter is cast in light from a central brazier, and the walls are made of laid stone. \n There is a door to your north and west.");
			}
			else if(currentRoom.getID() == 3)
			{
				currentRoom = rooms[1];
                System.out.println("The wide atrium you enter has chiseled stone columns and brick archways adorned with porticos containing crumbling statues. \n There is a cobweb-filled hallway to your west and a torch-lit corridor to your east.");
			}
			else
			{
				System.out.println("You can't move in this direction.");
			}
		}
	}
}