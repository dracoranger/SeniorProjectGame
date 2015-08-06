
package game.Items;

/**
 *Creates items class 
 * @author Tate
 */

public abstract class Items 
{
    String description="";
    boolean doesHave=false;//not sure if I should use the boolean or int identifier
    String name;
    int identify;//determines whether or not user has item
    
    public Items()
    {
        description="";
        name="";
        identify=0;
    }
    
    //returns the name
    public String named()
    {
        
        return name;
    }
    
    //returns description
    public String describe()
    {
    return description;
}
    //picks up object
    public void pickup()
    {
        doesHave=true;
        
    }
    
    public int identifier()
    {
        return identify;
    
    }

    //Returns if user has item
    public boolean has()
    {
        return doesHave;
        
    }

}
