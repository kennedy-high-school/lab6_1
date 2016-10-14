package lab6_1;

// Implements the game of Craps logic

public class CrapsGame
{
    private int point = 0;

    /**
     *  Calculates the result of the next dice roll in the Craps game.
     *  The parameter total is the sum of dots on two dice.
     *  point is set to the saved total, if the game continues,
     *  or 0, if the game has ended.
     *  Returns 1 if player won, -1 if player lost,
     *  0 if player continues rolling.
     */
    public int processRoll(int total)
    {
        int result;
        if(point == 0)
        {
            switch(total)
            {
                case 7:
                result = 1; //win
                break;
                case 11:
                result = 1; //win
                break;
                case 2:
                result = -1; //lose
                break;
                case 3:
                result = -1; //lose
                break;
                case 12:
                result = -1; //lose
                break;
                default:
                result = 0; //continue
                break;
            }
            
        } else {
            if (point == total){ // win
                result = 1;
            } else if (total == 7)
            {
                result = -1;
            } else {
                result = 0;
            }
        }
        if (result != 0)
            {
                point = 0;
            } else {
                point = total;
            }
        return result;
    }

    /**
     *  Returns the saved point
     */
    public int getPoint()
    {
        return point;
    }
}

