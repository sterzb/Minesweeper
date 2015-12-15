import java.lang.Math;
import java.lang.Object;
import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 * 
 * This method controls the game.
 * inits game and is the main driver
 * @author (Ben Sterzinger) 
 * @version (3.2.11)
 */
public class gamemain extends board{
    
    private int xx;
    private int yy;
    public int targetRow;
    public int targetCol;
    public int score = 0;
    public boolean go = true;
    boolean goAgain = true;
    /** this method operates the game.
     * @param    go controls the while loop running the game.
     * @return   will throw exception to end game if it is false.
     * @param    xx is the user input row number
     * @param   go operates preconditioning
     * @param   goAgain also operates pre conditionng
     * @param    targetRow is the int form of xx
     * @return   will throw an exception if a negative number is entered
     * @param   yy is the user input of the column choice
     * @param    targetCol is the int form of yy
     * @return   it will throw an exception if a negative number is entered.
     * buggy code has been omitted
     */
    public gamemain()
    {
        // initialise instance variables
        System.out.println("Welcome to Mine Sweeper");//begin user dialog
       // player player;
       Players.playerName();
        //new player();  allows for player to set name for storage
        startBoard();//draws first board
        //tileMaker.tileGo();
      while (go == true){  // continues until user stops game
        if (go != true){
            throw new IllegalArgumentException("End Game?");}   
        while (goAgain== true){
        System.out.println("Choose your targets by first entering the row number;");
        System.out.println("Please choose the row number");
       Scanner xx = new Scanner(System.in);
       if (xx.hasNextInt() ){
           targetRow=xx.nextInt();
            ///targetRow > 0: "The number must be positive";//check if number is positive
            goAgain = false;
        }else{
            //throw new IllegalArgumentException("Bad Number");
    }
}
       //if (targetRow <= 15 ){
       System.out.println("Please choose the column number");//user entry column
       Scanner yy = new Scanner(System.in);
     boolean goodTOgo =false; 
    // while (goodTOgo = false){   
     if (yy.hasNextInt() ){
            targetCol=yy.nextInt();
            ///targetRow > 0: "The number must be positive";//check if number is positive
            goodTOgo = true;
        }else{
            //throw new IllegalArgumentException("Bad Number");
    }  
       assert targetCol < 30:"Number out of range.  Try again."; //check for number in range
       assert targetRow < 30:"Number out of range. XP Try again."; // check for number in range
    //call check number here
      tileMaker.tileChecker(targetRow,targetCol);
      drawBoard();
      goAgain = true;
    }
  //System.out.println("Keep Playing? Y or N");
  //Scanner keepGoing = new Scanner(System.in);
   // keepGoing.toString();
  //if (keepGoing.toString() == "y"){
  //     go = true;
  // }else{
    //   go = false;
//}  

//}
}}

