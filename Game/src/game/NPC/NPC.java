/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package game.NPC;

/**
 *
 * @author Tate
 */
public abstract class NPC 
{
 String name="";
 int lines;//number of lines in initial statement
 String describe="";
 
 public NPC()
 {
     name="";
     lines=0;
     describe="";
 }
 
 //Describes the NPC
 public String describe()
 {
     return describe;
     
 }
 
 //Returns the number of lines the NPC has in the initial statement
 public int lineNum()
 {
     return lines;
 }
 
 //initial statement
 public abstract String intState();
//returns whether or not objectives have been completed
 public abstract boolean logic(); 
 //holds the speech of the character
 public abstract String Speech(int line); 
}
