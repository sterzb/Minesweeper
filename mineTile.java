
/**
 *
 * Throws mine tile message wen a mine tile is selected
 * @author (J6) 
 * @version (3.2.11)
 */
public class mineTile extends tileMaker
{
    // instance variables - replace the example below with your own
    public int x;
    private int score = 5;
    /**
     * Constructor for objects of class mineTile
     */
    public mineTile(int score)
    {
       System.out.println("You chose a Mine tile. Game Over");
       int points = -5;
       score = score;
       statistics.totalScore(points);
       //gamemain.goAgain = false;
       //gamemain.go = false;
    }
       
       // initialise instance variables
     
    }

