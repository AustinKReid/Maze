public class MazeEscape {

     private char[][] maze;
     private int movements;

     public MazeEscape(char[][] maze){
         this.maze = maze;
     }

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

     public char[][] getMaze(){
         return maze;
     }

     public int getMovements(){
         return movements;
     }
}
