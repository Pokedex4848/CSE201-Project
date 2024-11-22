/**
 * The class that controls the Doors in each Room.
 */
public class Door
{
	private boolean open;
	private int doorID;
	private String doorCode;
	
	/**
	 * Constructor for the Door class for Doors without codes needed to open them.
	 * 
	 * @param doorID The ID that goes which a certain Door
	 */
	public Door(int doorID)
	{
		this(doorID, "");
	}
	
	/**
	 * Constructor for the Door class for Doors with codes needed to open them.
	 * 
	 * @param doorID   The ID that goes which a certain Door
	 * @param doorCode The code needed to open the Door
	 */
	public Door(int doorID, String doorCode)
	{
		this.doorID = doorID;
		open = false;
		this.doorCode = doorCode;
	}
	
	/**
	 * Checks if the Door is open.
	 * 
	 * @return Whether the Door is open or not.
	 */
	public boolean isOpen()
	{
		return open;
	}
	
	/**
	 * Method that opens a Door if it needs a code to be opened.
	 * 
	 * @param code The code entered in to try and open the Door
	 */
	public void openDoor(String code)
	{
		if(doorCode.equals(code))
		{
			open = true;
		}
	}
}