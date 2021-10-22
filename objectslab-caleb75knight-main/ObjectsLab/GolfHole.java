class GolfHole
{
    /*#
     * [] TODO 9: Add the following fields for a golf hole. Each of the fields 
     * will be decimal values.
     * 
     * - xPos, the x coordinate of the hole.
     * - yPos, the y coordinate of the hole.
     * - closeEnough, a maximum distance between the golf ball and the hole
     * for the golf ball to count as "inside" the hole.
     */
    double xPos;
    double yPos;
    double closeEnough;
    /*#
     * [] TODO 10: Write a constructor for a golf hole. The x and y coordinates
     * should be accepted as inputs.
     * 
     * Give the closeEnough constant a value of 5.
     */
    GolfHole(double xPos, double yPos)
    {
        this.closeEnough = 5;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    double distanceTo(GolfBall gb)
    {
        /*#
         * [] TODO 11: This method should implement the distance formula to return 

           i* the distance between the golf ball and the golf hole.
         */
        double distance = Math.sqrt((gb.xPos - xPos)*(gb.xPos - xPos)+(gb.yPos - yPos)*(gb.yPos - yPos));
        return distance;
    }  

    boolean hasGolfBall(GolfBall gb)
    {
        /*#
         * [] TODO 12: This method should return true if the distance 
         * between the golf ball and the golf hole is at least closeEnough.
         * It returns false otherwise.
         */
        if(distanceTo(gb) <= closeEnough)
        {
          return true ; 
        }
        else
        {
           return false;
        }
    }
}