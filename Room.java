public class Room
{
	private int roomID;
	
	public Room(int roomID)
	{
		this.roomID = roomID;
	}
	
	public String look()
	{
		return "Test " + roomID;
	}
	
	public int getID()
	{
		return roomID;
	}
}