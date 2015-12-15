
/**
 * Throws blank tile message when a blank tile is seleced by the user
 * 
 * @author j6) 
 * @version (3.2.11)
 */
public class blankTile extends tileMaker
{
    // instance variables - replace the example below with your own
    private int x;
    public static int TotalScore;
    /**
     * Constructor for objects of class blankTile
     */
    public blankTile(int score)
    {
        // initialise instance variables
       System.out.println("You chose a blank tile.  Choose again");
       int points = 1;
       score = totalScore;
       statistics.totalScore(points);
       
    }
    }
