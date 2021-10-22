import java.util.Random;

class GolfGame
{
    /*#
     * [] TODO 13: Add the required fields below along with their appropriate 
     * data types.
     * 
     * - ball, a GolfBall object
     * - hole, a GolfHole object
     * - width, a decimal representing the size in pixels for the game's width
     * - height, a decimal representing the size in pixels for the game's height
     * - putts, an integer tracking the number of times the player has moved the ball
     * - isGameOver, a true/false value representing the state of the game
     */
    GolfBall ball;
    GolfHole Hole;
    double width;
    double height;
    int putts;
    boolean isGameOver;
    /*#
     * [] TODO 14: Write a constructor for a golf game. No imputs are expected.
     * 
     * Set width and height to a default value of 500.
     * Set putts to an initial value of 0.
     * Set isGameOver to false.
     * 
     * Initialize ball with the GolfBall(x, y) constructor, giving it two arbitrary
     * x and y values between 0 and 500 (you pick).
     * 
     * Initialize hole with the GolfHole(x, y) constructor, giving it two arbitrary
     * x and y values between 0 and 500 (you pick).
     * 
     * Optional: As an extra challenge, use randomness to seed these starting 
     * coordinates so you will get a different game each time.
     */
    GolfGame()
    {
        this.width = 500;
        this.height = 500;
        this.putts = 0;
        this.isGameOver = false;
        ball = new GolfBall(4,6);
        Hole = new GolfHole(467,248);
    }

    void putt(double mouseX, double mouseY)
    {
        /*#
         * [] TODO 15: This method will give the ball some velocity when the user clicks
         * the mouse. The velocity will be relative to the mouse's coordinates and 
         * the ball's coordinates.
         * 
         * Call the ball.setVelocity(xv, yv) instance method.
         * 
         * xv should be equal to the ball's x position - mouseX.
         * yv should be equal to the ball's y position - mouseY.
         * 
         * Put all of this code within an if statement that checks if the ball is not 
         * moving and the game is not over.
         */
        ball.setVelocity(ball.xPos-mouseX, ball.yPos-mouseY);
        if(ball.isMoving() == false)
        {
            isGameOver = false;
        }
    }

    void checkForBounce()
    {
        /*#
         * [] TODO 16: This method will check if the ball is about to leave the play
         * area and bounce the ball against the wall to prevent that from happening.
         * 
         * Call the ball.bounceHorizontal() instance method if the ball's x coordinate
         * is less than zero or greater than the width of the game.
         * 
         * Call the ball.bounceVertical() instance method if the ball's y coordinate
         * is less than zero or greater than the height of the game.
         */
        if(ball.xPos >= 500 || ball.xPos <=0)
        {
            ball.bounceHorizontal();
        }
        if(ball.yPos >= 500 || ball.xPos <=0)
        {
            ball.bounceVertical();
        }
    }
    
    void update()
    {
         /*#
         * [] TODO 17: Just uncomment this code. Nothing else to do here.
         * I wrote this one for you.
         *
         * This method will move the ball for one step of its animation and check
         * for the win condition.
         */
        
        
        if (this.isGameOver) 
        {
           return; //Prevent code below from running.
        }
        
        if (Hole.hasGolfBall(ball))
        {
           ball.setVelocity(0, 0);
           isGameOver = true;
        }
        
        checkForBounce();
        ball.move();
        
    }
}