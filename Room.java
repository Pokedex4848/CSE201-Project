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
            return "You are standing in a small room, with a solid wood table to your left and a candle sitting atop it, casting flickering shadows across the walls. \n The air is thick with the scent of melted wax and old wood, adding to the room's heavy, somber atmosphere. \n A single, narrow doorway lies to the north, leading into darkness." + roomID;
        case 1:
            return "The wide atrium you enter has chiseled stone columns and brick archways adorned with porticos containing crumbling statues.\n The flickering torchlight dances across the stone walls, casting eerie shadows that bring the statues to life. \n A faint, musty smell lingers in the air, hinting at the age and abandonment of this once-grand hall. \n There is a cobweb-filled hallway to your west and a torch-lit corridor to your east. " + roomID;
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