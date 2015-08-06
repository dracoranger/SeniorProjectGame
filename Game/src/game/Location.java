/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import game.Room.Room;
import game.Room.Bank;
import game.Room.Bathroom;
import game.Room.Casino;
import game.Room.Cell;
import game.Room.DWS;
import game.Room.Exit;
import game.Room.Gate;
import game.Room.GuardR;
import game.Room.Lava;
import game.Room.MainE;
import game.Room.MainW;
import game.Room.Starbucks;
import game.Room.Tavern;
import game.Room.Throne;

/**
 * Creates and stores locations
 * @author Tate
 */
public class Location 
{
    String describe, name, items, people;
    boolean locked;
    String NorthNo="";//toString strings for surrounding rooms
    String NorthYes="";
    String NorthLocked="";
    String SouthNo="";
    String SouthYes="";
    String SouthLocked="";
    String EastNo="";
    String EastYes="";
    String EastLocked="";
    String WestNo="";
    String WestYes="";
    String WestLocked="";
    static final String LOCKED="";//Need to make
    static final String UNLOCKED="";
    int otrRooms=0;
    
    
    /**
     *
     * @param x
     */
    public Location(int x)
    {
      
        if(x==7)//Probably want to revise this series
        {
            Room able=new Bank();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==2)
        {
            Room able=new Bathroom();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==5)
        {
            Room able=new Casino();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==1)
        {
            Room able=new Cell();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==13)
        {
            Room able=new DWS();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==4)
        {
            Room able=new Exit();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==11)
        {
            Room able=new Gate();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==3)
        {
            Room able=new GuardR();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==12)
        {
            Room able=new Lava();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==6)
        {
            Room able=new MainE();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==9)
        {
            Room able=new MainW();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==10)
        {
            Room able=new Starbucks();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==8)
        {
            Room able=new Tavern();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else if(x==14)
        {
            Room able=new Throne();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        else
        {
            Room able= new Cell();
            name=able.name();   
            describe=able.describe();     
            items=able.hasItems();
            people=able.hasPeople();
            locked=able.isLocked();
            otrRooms=able.connectingRooms();
        }
        
        
    }
    
    public String getName()
    {
        return name;
    }
    public String getDescribe()
    {
        return describe;
    }
    public String getItems()
    {
        return items;
    }
    public String getPeople()
    {
        return people;
    }
    public String locked()
    {
        String x="";
        if(locked)
        x= LOCKED;
        else if(! locked)
        x= UNLOCKED;
        return x;
    }
    //Returns avalible rooms
    public String otherRooms()
    {
        int a,b,c,d,x;
        String returned="";
        x=otrRooms;
        a=x%12;
        x=x/12;
        b=x%12;
        x=x/12;
        c=x%12;
        x=x/12;
        d=x%12;
        if (a==5)
            returned=returned+NorthNo+" ";
        else if (a==9)
            returned=returned+NorthLocked+" ";
        else 
            returned=returned+NorthYes+" ";
        if (b==6)
            returned=returned+EastNo+" ";
        else if (b==10)
            returned=returned+EastLocked+" ";
        else 
            returned=returned+EastYes+" ";
        if (c==7)
            returned=returned+SouthNo+" ";
        else if (c==11)
            returned=returned+SouthLocked+" ";
        else 
            returned=returned+SouthYes+" ";
        if (d==8)
            returned=returned+WestNo+" ";
        else if (d==12)
            returned=returned+WestLocked+" ";
        else 
            returned=returned+WestYes+" ";
        return returned;
    }
}
