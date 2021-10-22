class GolfBall
{
    /*#
     * [] TODO 1: Add the following fields for a GolfBall. Each of the
     * fields will be decimal values.
     * 
     * - xPos, the x-coordinate of the golf ball
     * - yPos, the y-cordinate of the golf ball
     * - xVel, the horizontal velocity of the golf ball.
     * - yVel, the vertical velocity of the golf ball.
     * - friction, a constant used to slow the golf ball. 
     */
    double xPos;
    double yPos;
    double xVel;
    double yVel;
    double friction;
    
    /*#
     * [] TODO 2: Create a constructor for a golf ball. The x and y coordinates
     * should be accepted as inputs.
     * 
     * The golf ball should not be moving (should have zero velocity) on construction.
     * 
     * The friction constant should be set to an intermediate value between 0.0 and 1.0, 
     * where 0 means no friction at all, and 1 means the ball will not move.
     */
   GolfBall(double xPos, double yPos)
   {
    this.xPos = xPos;
    this.yPos = yPos;  
    this.xVel = 0;
    this.yVel = 0;
    this.friction = .5;
   } 

    boolean isMoving()
    {
        /*#
         * [] TODO 3: This method returns true if the horizontal and vertical velocity 
         * are both zero. It returns true otherwise.
         */
        if(xVel == 0 && yVel == 0)
        
        {
            return false;
        }
        else
        {
        return true;
        }
    }

    void move()
    {
        /*#
         * [] TODO 4: This method increments the x coordinate by the x velocity and
         * increments the y coordinate by the y velocity. Lastly, it should call
         * the applyFriction() method.
         */
        xPos = xPos + xVel;
        yPos = yPos + yVel;
        applyFriction();
    }

    void setVelocity(double xv, double yv)
    {
        /*#
         * [] TODO 5: This method simply sets the x and y velocity to the values given
         * as input.
         */
        xVel = xv;
        yVel = yv;
    }

    void applyFriction()
    {
        /*#
         * [] TODO 6: This method will slow the golf ball by dampening the velocity.
         * 
         * Set the x velocity to its current value multiplied by (1 - friction).
         * 
         * Check if the absolute value of the x velocity is less than 0.01. If so,
         * set the x velocity to 0.
         * 
         * Do the same steps above for the y velocity.
         */
        xVel = xVel * (1-friction);
        if(Math.abs(xVel) < 0.01)
        {
            xVel = 0;
        }
        else
        {
           yVel = 0; 
        }
        }
        
 

    void bounceHorizontal()
    {
        /*#
         * [] TODO 7: This method will be used for reversing the direction of the
         * x velocity when the golf ball bounces against a wall.
         * 
         * Set the x velocity to its current value multiplied by -1.
         */
        xVel = xVel * -1;
    }

    void bounceVertical()
    {
        /*#
         * [] TODO 8: This method will be used for reversing the direction of the
         * y velocity when the golf ball bounces against a wall.
         * 
         * Set the y velocity to its current value multiplied by -1.
         */
        yVel = yVel * -1;
    }
}