
/**
 * 
 * Throws a flag tile message when the flag tile is selected by the user
 * @author (J6) 
 * @version (3.2.11)
 */
public class flagTile extends tileMaker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class flagTile
     */
    public flagTile(int score)
    {
        // initialise instance variables
       System.out.println("You chose a Flag tile. you get 3 points. Choose again.");
       int points = 3;
       score = score;
       statistics.totalScore(points);
    }


}