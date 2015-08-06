/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package game.Items;

/**
 *
 * @author Tate
 */
public class Money extends Items
{

    int amount=0;
    boolean doesHave=true;
    public Money()
    {
        description="";
        name="";
        identify=0;
    }
    
    //returns amount of money
    public boolean canPay(int x)
    {
        if(x<=amount)
            return true;
        else
            return false;
    }
    
    public void paying(int x)
    {
        amount=amount-x;
        
    }
    
    public void paid(int x)
    {
        amount=amount+x;
        
    }
    
    public int howMuch()
    {
        return amount;
        
    }
}
