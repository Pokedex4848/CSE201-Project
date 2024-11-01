/**
 * Class that creates each room and their corresponding IDs.
 */
public class Room {
	/**
	 * Holds the ID of the Room.
	 */
	private int roomID;

	/**
	 * Constructor that builds the Room object.
	 * 
	 * @param roomID The ID of the Room
	 */
	public Room(int roomID) {
		this.roomID = roomID;
	}

	/**
	 * Method that gives the description of each Room, including how it looks and
	 * what may be useful in each room.
	 * 
	 * @return The description of the Room.
	 */
	public String look() {
		return "Test " + roomID;
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