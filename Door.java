public class Door
{
	private boolean open;
	private int doorID;
	private String doorCode;
	
	public Door(int doorID)
	{
		this.doorID = doorID;
		open = false;
		doorCode = "";
	}
	
	public Door(int doorID, String doorCode)
	{
		this.doorID = doorID;
		open = false;
		this.doorCode = doorCode;
	}
	
	public boolean isOpen()
	{
		return open;
	}
	
	public void openDoor(String code)
	{
		if(doorCode.equals(code))
		{
			open = true;
		}
	}
}