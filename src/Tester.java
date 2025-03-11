public class Tester {
    public static void main(String[] args) {
        char[][] maze = {
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

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

    }
}
