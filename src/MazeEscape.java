public class MazeEscape {

     private char[][] maze;
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
     * @param posX X coordinate of the maze
     * @param posY Y coordinate of the maze
     * @return returns if it is escapable or not
     */

     public boolean attemptEscape(int posX, int posY){

        if (posX < 0
                || posY < 0
                || posX >= maze.length
                || posY >= maze[0].length
                || maze[posX][posY] == '*' //single astrix
                || maze[posX][posY] == 'O'){

            return false;

        }

         if (posX == 0
                 || posY == 0
                 || posX == maze.length - 1
                 || posY == maze[0].length - 1) {

             movements++;

             return true;

         }

         maze[posX][posY] = 'O';

        if(attemptEscape(posX + 1, posY)
                || attemptEscape(posX - 1, posY)
                || attemptEscape(posX, posY + 1)
                || attemptEscape(posX, posY -1)){

            movements++;

            return true;

        } else {

            maze[posX][posY] = ' ';
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
