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
            return "The room you enter is cast in light from a central brazier, and the walls are made of laid stone. \n The flames crackle softly, casting shifting shadows that dance across the uneven stones. \n There is a faint scent of burning herbs, and you can hear the distant dripping of water echoing through the stone corridors. A door stands to your north and another to the west, each with faint markings worn by time." + roomID;
        case 3:
            return "Steaming pipes spiderweb the walls, hissing softly as they release occasional bursts of vapor into the air. \n The heat from the pipes warms the room, creating a slight haze that blurs the edges of the shadows. \n A mahogany desk sits in the corner, atop its surface sits a rusting key. \n There is a passage to your north, where the scent of damp earth drifts in, and another to the east, obscured by a slight fog from the steam." + roomID;
        case 4:
            return "This hallway is barren except for the braziers placed at intervals along the walls, casting flickering pools of orange light that barely break through the darkness. The stone floor is cold and slightly damp beneath your feet, and the silence here feels almost heavy. There is a door to your east, slightly ajar, and another to the south, its iron handle tarnished with age." + roomID;
        case 5:
            return "" + roomID; // Puzzle room description to be added after puzzle creation
        case 6:
            return "A chill wind whistles through this corridor, rushing up through steel grates along the floor and carrying with it a faint metallic scent. \n The walls are bare, and the air feels damp and cool, as if it has traveled from deep underground. \n The sound of the wind echoes, creating an eerie, hollow resonance that fills the passage. \n There are entrances to your east, where faint light glows, and to the south, disappearing into shadow." + roomID;
        case 7:
            return "" + roomID; // Puzzle room description to be added after puzzle creation
        default:
            return "This room doesn't exist";
        }
    }
    
	/**
	 * Method that allows the user to pick up various items in a room and adds it to
	 * their inventory if the item exists in the room that they are in.
	 * 
	 * @param input The item that the user is trying to pick up.
	 * @return True of the item can be picked up, false if it can't be picked up.
	 */
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
    
	/**
	 * Method to return the name of the item in each room.
	 * 
	 * @return The name of the item.
	 */
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