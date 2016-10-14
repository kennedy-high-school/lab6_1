package lab6_1;


/**
 * Write a description of class Die here.
 * 
 * @author Leif Segen 
 * @version 2016-10-14
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int numDots;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        numDots = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void roll()
    {
        // put your code here
        numDots = (int)(Math.random()*6+0.5);
    }
    
    public int getNumDots()
    {
        return numDots;
    }
    
    public static void main(String[] args)
    {
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
    }
}
