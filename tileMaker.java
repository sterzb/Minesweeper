import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java. util.*;
/**
 * Write a description of class tileMaker here.
 * This class chooses at random the mine tiles and builds the tile array.
 * @author BSterzinger. 
 * @version (3.2.11)
 */
public class tileMaker extends board
{
  
   public int mineX;
   public int mineY;
   public int columns;
   public int rows;
   public int totalScore;
   public static int tileBoard[][];
   public int score;
    /**
     * This method creates the virtual game map for the mines.
     * @param  columns used for virtual game map generation.
     * @param  mines used for virtual game map generation
     * @return virtual map with mine tile or blank tile in a 2d array.
     */
public static int [][]tileGo(int rows, int columns, int mineMax)
    {
       Boolean nOn = false;
        while (nOn == false){
       // System.out.println("Please enter the number of mines");//chooses number of mines
      // Scanner mineMax = new Scanner(System.in);
       int mines = mineMax;
        if ( mineMax>0) {
           int  minesss=mineMax;
            //check if number is positive
           nOn = true;
        }else{
           nOn = false;//throw new IllegalArgumentException("Bad Number");
        }
    }
       //int minesss= mines.hasNextInt();
       int tileBoard[][] = new int[rows][columns];// tile array init
       Random randomGenerator = new Random(); 
       for (int r = 0; r<= mineMax ; r++){ //places either mine tile or blank tile in  its array space
           //Random randomGenerator = new Random();
           int X = randomGenerator.nextInt(rows-3);
           int Y = randomGenerator.nextInt(columns-3);
          tileBoard[X][Y] = 3;// mine tile
          if (X>1){
          tileBoard[X-1][Y] = 2;}
          if (Y>1){
          tileBoard[X][Y-1] = 2;}
          if (X > rows){
          tileBoard[X+1][Y] = 2;}
          if (Y > columns){
          tileBoard[X][Y+1] = 2;}
            //return tileBoard;
    }      //System.out.println (tileBoard[X][Y])
    for (int p = rows-1; p>=0; p--){
        for(int q = columns-1; q>=0; q--)
            if (tileBoard[p][q] != 3 || tileBoard[p][q]!= 2){
                tileBoard[p][q] = 1; //blank tile
            }
        }
        //System.out.print(tileBoard);
        System.out.println("Mines Set. Good Luck");
        return tileBoard;
        
    }
   
 public static boolean tileChecker (int targetRow, int targetCol)
  {
   //int tileBoard[][]= tileGo.tileBoard[][];
  int tileBoard[][]; 
      int r = 1;
   
    System.out.print("You chose: " + targetRow + ",");
    System.out.println(targetCol);
    int p = targetRow;
    int q = targetCol;
    int score=statistics.totalScore;
    int points;
    boolean goAgain;
   
    //r = tileBoard[p][q];
    //System.out.println ("Your selection is a " + r);
    if (r==1){
    new blankTile(score);
    goAgain = true;}
    else if (r==3){
    new flagTile(score);
    goAgain = true;
}
    else{
    new mineTile(score);
    goAgain = false;
}
  
     return goAgain;
}
  
  }  
   

