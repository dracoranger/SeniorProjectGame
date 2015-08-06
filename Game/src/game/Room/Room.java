/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package game.Room;

/**
 *
 * @author Tate
 */
public abstract class Room 
{
    String name;
    String description;
    boolean isLocked=false;
    
    public Room()
    {
        name=""; 
        description="";
        
    }
    public String name()
    {
        return name;
    }
    
    public String describe()
    {
        return description;
    }
    
    public void unlock()
    {
        isLocked=false;
        
    }
    
    public boolean isLocked()
    {
        return isLocked;
    }
   
    //Returns items present in room
    public abstract String hasItems();

    //Returns people present in the room
    public abstract String hasPeople();
    
    //Returns connecting rooms 1-4 exist in that direction, 5-8 don't exist
    public abstract int connectingRooms();
}
