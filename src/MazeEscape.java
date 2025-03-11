public class MazeEscape {

     final private char[][] maze;
     private int movements;

    /**
     * Constructor for the maze
     * @param maze maze to be constructed
     */

     public MazeEscape(char[][] maze){
         this.maze = maze;
     }

    /**
     * Attempts to escape the maze
     * @param row X coordinate of the maze
     * @param column Y coordinate of the maze
     * @return returns if it is escapable or not
     */
    
     public boolean attemptEscape(int row, int column){

         //test if the current spot is invalid
         if (row < 0
                || column < 0
                || row >= maze.length
                || column >= maze[0].length
                || maze[row][column] == '*' //single astrix
                || maze[row][column] == 'O'){

            return false;

         }

        //Tests if the current spot is an exit
         if (row == 0
                 || column == 0
                 || row == maze.length - 1
                 || column == maze[0].length - 1) {

             movements++;

             return true;

         }

         //breadcrumbs
         maze[row][column] = 'O';

         //Recursion in all directions
         if(attemptEscape(row + 1, column)
                || attemptEscape(row - 1, column)
                || attemptEscape(row, column + 1)
                || attemptEscape(row, column -1)){

            movements++;

            return true;

         } else {

            maze[row][column] = ' '; //Removing after backtrack
            return false;

         }


     }

    /**
     * Gets the maze with the marked up route
     * @return the maze
     */

     public char[][] getMaze(){
         return maze;
     }

    /**
     * Gets how many movements were made to reach the exit excluding discarded moves
     * @return movements
     */

     public int getMovements(){
         return movements;
     }
}
