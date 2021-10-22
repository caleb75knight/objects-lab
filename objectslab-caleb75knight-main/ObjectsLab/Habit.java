class Habit
{
    /*#
     * [] TODO 1: Add the following fields for a habit
     * along with the appropriate data types.
     * 
     * A Habit has the following fields:
     *  - name, a piece of text describing the habit.
     *  - completions, an integer counting the number 
     *  of times the habit is performed.
     *  - goal, an integer tracking the number times the 
     *  habit should be completed successfully.
     */
    String name;
    int completions;
    int goal;

    
    /*#
     * [] TODO 2: Create a constructor for a Habit.
     * 
     * The completions field should have a starting value of 0.
     */
    Habit(int completions, int goal)
    {
      this.completions = 0;
      this.goal = goal;
      this.name = name;
    }
    /*#
     * [] TODO 3: Create a second constructor for a Habit
     * that takes no inputs and chooses generic defaults
     * for all of the fields. These will be edited by a user 
     * later.
     * 
     * For instance, the name of the habit could be set to
     * something like "Enter a description."
     */
    Habit()
    {
     this.completions = 0;
     this.goal = 10;
     this.name = "Enter a description";
    }
    
    void addCompletion()
    {
        /*#
         * [] TODO 4: This method should simply increment 
         * completions by 1.
         */
        completions++;
    }
    
    void resetCompletions()
    {
        /*#
         * [] TODO 5: This method should set the completions variable
         * back to zero.
         */
        this.completions = 0;
    }
    
    void setName(String name)
    {
        /*#
         * [] TODO 6: This method should set the name field to 
         * the string given as input to this method.
         */
        this.name = this.name;
    }
    
    void setGoal(int n)
    {
        /*#
         * [] TODO 7: This method should set the goal field to 
         * the integer given as input to this method.
         */
        this.goal = n;
    }
    
    boolean isComplete(int n)
    {
        /*#
         * [] TODO 8: This method should return true if the number of
         * completions is equal to (or has surpassed) the goal.
         * Otherwise it should return false.
         */
        if(completions >= n)
        {
            return true;
        }
        else
        {
          return false;  
        }
        
        
    }
    
    double getGoalProgress()
    {
        /*#
         * [] TODO 9: This method should return the progress of the goal as a
         * decimal between 0.0 and 1.0. Divide the number of completions
         * by the goal.
         * 
         * Since both of these values are integers, you will have to cast the
         * value to a double.
         */
        return(double) completions/goal;
    }
}
    
