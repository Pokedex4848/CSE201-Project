/**
 * Class that creates each room and their corresponding IDs.
 */
public class Room {
	/**
	 * Holds the ID of the Room.
	 */
	private int roomID;
	private String item;
	private boolean canPickUp;

	/**
	 * Constructor that builds the Room object.
	 * 
	 * @param roomID The ID of the Room
	 */
	public Room(int roomID) {
		this.roomID = roomID;
		this.canPickUp = true;
	}

	/**
	 * Method that gives the description of each Room, including how it looks and
	 * what may be useful in each room.
	 * 
	 * @return The description of the Room.
	 */
	public String look()
	{
		switch(roomID)
		{
		case 0:
			return "" + roomID;
		case 1:
			return "" + roomID;
		case 2:
			return "" + roomID;
		case 3:
			return "" + roomID;
		case 4:
			return "" + roomID;
		case 5:
			return "" + roomID;
		case 6:
			return "" + roomID;
		case 7:
			return "" + roomID;
		default:
			return "This room doesn't exist";
		}
	}
	
	public boolean pickUp(String input)
	{
		if(canPickUp)
		{
			if(roomID == 1 && input.contains("key"))
			{
				canPickUp = false;
				item = "Key";
				System.out.println("Picked up key!");
				return true;
			}
			else
			{
				System.out.println("This item doesn't exist in this room!");
				return false;
			}
		}
		else
		{
			System.out.println("This item doesn't exist in this room!");
			return false;
		}
	}
	
	public String getItem()
	{
		return item;
	}

	/**
	 * Returns the ID of the Room.
	 * 
	 * @return the Room's ID.
	 */
	public int getID() {
		return roomID;
	}
}