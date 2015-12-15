import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * Write a description of class player here.
 * sends players name to players.csv file for storage
 * @author (Ben Sterzinger) 
 * @version (3.2.11)
 */
public class Players
{
 //ArrayList<players> myPeople = new ArrayList<players>();  // instance variables - replace the example below with your own
   public String name;
   private String FirstName;
   private String LastName;
   private String Email;
   public String Fname;
   public String Lname;
   public String email;
   private int hhh = 3;
   private int x = 0;
   public boolean addAnother = true;
   
   public static String playerName()
    {
        ArrayList<Players> myPeople = new ArrayList<Players>();
        //MyPlayers player = new PlayerNu();
       
        Scanner user_input = new Scanner( System.in );
        System.out.println("Please enter the Player's First Name: ");
        String Fname = user_input.next();
       
        System.out.println("Please enter the Player's Last Name: ");
        Scanner nname = new Scanner(System.in);
        String Lname = nname.next();
        
       
        
        System.out.println("Please enter the Player's Email: ");
        Scanner mail = new Scanner(System.in);
        String email = mail.next();
       
    

       
        FileWriter myWriter; 
        try{
        myWriter = new FileWriter("players.csv");
        myWriter.write(Fname + "," +Lname + "," + email + "\n" );
        
            myWriter.close();            
        }
        catch(IOException e){
        }
        
    

    {
    BufferedReader myReader;
        
        try {
            myReader = new BufferedReader(new FileReader("players.csv"));
            String myData;
            do {
                myData = myReader.readLine();
                System.out.println(myData);
            } while (myData != null);
            myReader.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Oh NO file not there!");
        }
        catch(IOException e) {
            System.out.println("Oh NO!");
        }
           return Fname;
    }
    
}
}
   

    
    
