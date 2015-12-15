import java.lang.Math;
import java.lang.Object;
import java.util.Scanner;
import java.util.*;
/**
 *
 * This is where the board that the user sees is constructed.  It uses user input and displays both 
 * the original board and the board after the user makes a tile selection.
 * @author (Ben Sterzinger) 
 * @version (3.2.11)
 */
public class board
{
    // instance variables - replace the example below with your own
    public Double xx;
    public Double yy;
    public int rows;
    public int columns; 
    public String rowHolder = " + ";
    public String nerrowHolder = " + ";
    //public String tileArray;
    /**
     * 
     * startBoard draws the original gameboard
     * @param    rows number of rows on the game board
     * @param    columns number of columns on the game board
     * @return   game board displayed for user
     * @return   it also generates the mine tile array
     * @return   exception for negative numbers entered by the user.
     */
    public void startBoard()//draws first board
    {
        // initialise instance variables
       
       System.out.println("Please enter the number of rows");  //user chooses the number of rows
       Scanner xx = new Scanner(System.in);
       //rows=xx.nextInt();
       if (xx.hasNextInt()){
         try {
         rows=xx.nextInt();}
            ///targetRow > 0: "The number must be positive";//check if number is positive
        //if (rows == 0){//checks for valid input
            
            catch( ArithmeticException e){
            
            
             throw new ArithmeticException("not a number. try again");
            }
            
        
       
    }
    System.out.println("Please enter the number of columns"); // user ch)oses number of columns(height)
       Scanner yy = new Scanner(System.in);
        if (yy.hasNextInt()){
         try {
         columns=yy.nextInt();}
            ///targetRow > 0: "The number must be positive";//check if number is positive
        //if (rows == 0){//checks for valid input
            
            catch( ArithmeticException e){
            
            
             throw new ArithmeticException("not a number. try again");
      
            }
       
    }
      // columns=yy.nextInt();
       
       assert columns > 0: "The number must be positive";
       String [][] tileArray = new String [rows][columns];
       System.out.println("Please enter the number of mines");
       Scanner mineMax = new Scanner(System.in);
       int mines = mineMax.nextInt();
       new tileMaker(); 
       tileMaker.tileGo(rows, columns, mines); //generates mine tiles and tilearray
       System.out.println("-----Mine Sweeper-----");
        System.out.print(" ");
        for (int r = 0; r<rows-1;r++){  //draws rows
        
        System.out.print(" "+r+" ");
        String flag = "x";//flag marker
        String colMaker = " + ";// unused tile marker
        
        rowHolder= this.rowHolder +colMaker;
    }
        int displayRows = rows - 1;
        System.out.println(" " + displayRows + "  ");       
        for (int i = 0; i<columns; i++) //draws columns
        {
        System.out.println(i+this.rowHolder+i);
    }
    System.out.print(" ");
    for (int r = 0; r<rows-1;r++){
        
        System.out.print(" "+r+" ");
        String flag = "x";
        String colMaker = " + ";
        rowHolder= this.rowHolder +colMaker;
    }        
    displayRows = rows - 1;
        System.out.println(" " + displayRows + "  ");   
       return;     
    }
   /*
    * draws user game board
    * 
    * @param will take in flag and mine coordinates in the future
    * @return game board for user other than the first one
    * 
    */
  
   public void drawBoard()//draws board other than when first initialized
   {
         nerrowHolder = " + ";
        
         System.out.println("-----Mine Sweeper-----");
        System.out.print(" ");
        for (int r = 0; r<rows-1;r++){
        
        System.out.print(" "+r+" ");
        String flag = "x";
        String colMaker = " + ";
        
        nerrowHolder= nerrowHolder +colMaker;
    }
        int nerdisplayRows = rows - 1;
        System.out.println(" " + nerdisplayRows + "  ");       
        for (int i = 0; i<columns; i++)
        {
        System.out.println(i+nerrowHolder+i);
    }
    System.out.print(" ");
    for (int r = 0; r<rows-1;r++){
        
        System.out.print(" "+r+" ");
        String flag = "x";
        String nercolMaker = " + ";
        rowHolder= nerrowHolder +nercolMaker;
    }        
    nerdisplayRows = rows - 1;
        System.out.println(" " + nerdisplayRows + "  ");   
       return;     
    }
}