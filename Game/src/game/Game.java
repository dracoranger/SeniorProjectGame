/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Tate
 */
public class Game {

    /**
     * creates game
     */
    public static void main(String[] args)
    {
        boolean play=true;
        boolean onwards=false;
        boolean inNewRoom=false;
        Scanner scan= new Scanner (System.in);  
        int playerX,playerY;

        
        while (play)
        {
            Location locl[][]=new Location [9][3];//Creates the map
            locl[0][1]=new Location(1);
            locl[0][2]=new Location(2);
            locl[1][1]=new Location(3);
            locl[2][1]=new Location(4);
            locl[3][0]=new Location(5);
            locl[3][1]=new Location(6);
            locl[3][2]=new Location(7);
            locl[4][0]=new Location(8);
            locl[4][1]=new Location(9);
            locl[4][2]=new Location(10);
            locl[5][1]=new Location(11);
            locl[6][1]=new Location(12);
            locl[7][1]=new Location(13);
            locl[8][1]=new Location(14);
                    
            Speech speech=new Speech();//Creates explanatory diologue
            for (int i=0; i<10; i++)
            {
            System.out.println(speech.intro(i));            
            }
            
            for (int i=0; i<10; i++)//Allows questioning of gaurds, need to implement
            {
            System.out.println(speech.guards(i));            
            }
            
            playerX=0;
            playerY=1;
            while(!inNewRoom)
            {
            System.out.println(locl[playerX][playerY].getName());
            System.out.println(locl[playerX][playerY].getDescribe());
            System.out.println(locl[playerX][playerY].getPeople());
            System.out.println(locl[playerX][playerY].getItems());
            System.out.println(locl[playerX][playerY].otherRooms());
                while(!onwards)
                 {
                      int doThis=0;
                      doThis=scan.nextInt();
                
                 }
            
            }
        }
    }
}
