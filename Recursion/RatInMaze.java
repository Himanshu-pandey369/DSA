import java.util.*;

public class RatInMaze {

    static ArrayList<String> ans = new ArrayList<>();

    public static ArrayList<String> findPath(int[][] maze) {

        int n = maze.length;

        // If starting cell is blocked
        if (maze[0][0] == 0) {
            return ans;
        }

        boolean[][] vis = new boolean[n][n];

        helper(maze, 0, 0, "", vis);

        return ans;
    }

    public static void helper(int[][] maze, int row, int col,
                              String path, boolean[][] vis) {

        int n = maze.length;

        // Base Case
        if (row == n - 1 && col == n - 1) {
            ans.add(path);
            return;
        }

        vis[row][col] = true;

        // Down
        if (row + 1 < n && maze[row + 1][col] == 1 && !vis[row + 1][col]) {
            helper(maze, row + 1, col, path + "D", vis);
        }

        // Left
        if (col - 1 >= 0 && maze[row][col - 1] == 1 && !vis[row][col - 1]) {
            helper(maze, row, col - 1, path + "L", vis);
        }

        // Right
        if (col + 1 < n && maze[row][col + 1] == 1 && !vis[row][col + 1]) {
            helper(maze, row, col + 1, path + "R", vis);
        }

        // Up
        if (row - 1 >= 0 && maze[row - 1][col] == 1 && !vis[row - 1][col]) {
            helper(maze, row - 1, col, path + "U", vis);
        }

        // Backtracking
        vis[row][col] = false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        System.out.println(findPath(maze));
    }
}