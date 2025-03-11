public class Tester {
    public static void main(String[] args) {

        char[][] maze = { //This is the maze which the program will try to explore and escape
                {'*', ' ', '*', '*', '*', '*', '*', '*'},
                {'*', ' ', ' ', ' ', '*', ' ', ' ', '*'},
                {'*', ' ', '*', '*', '*', '*', ' ', '*'},
                {'*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
                {'*', ' ', '*', ' ', '*', '*', '*', '*'},
                {'*', ' ', ' ', ' ', '*', ' ', ' ', '*'},
                {'*', '*', '*', ' ', '*', ' ', '*', '*'},
                {'*', '*', '*', '*', '*', '*', '*', '*'}
        };

        MazeEscape s1 = new MazeEscape(maze);

        System.out.println(s1.attemptEscape(5,1));
        System.out.println(s1.getMovements());

        maze = s1.getMaze();

        //Getting the maze back into a printable form
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

    }
}
