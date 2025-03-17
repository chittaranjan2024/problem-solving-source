package com.test;

import java.util.ArrayList;

class RatInMazeAllPaths {
    static int N; // Maze size

    // Check if (x, y) is a valid move
    static boolean isSafe(int maze[][], int x, int y, boolean visited[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1 && !visited[x][y]);
    }

    // Backtracking function to find all paths
    static void findPaths(int maze[][], int x, int y, boolean visited[][], String path, ArrayList<String> paths) {
        // Base Case: If destination (N-1, N-1) is reached, store the path
        if (x == N - 1 && y == N - 1) {
            paths.add(path);
            return;
        }

        // Mark the cell as visited
        visited[x][y] = true;

        // Move Down (D)
        if (isSafe(maze, x + 1, y, visited))
            findPaths(maze, x + 1, y, visited, path + "D", paths);

        // Move Right (R)
        if (isSafe(maze, x, y + 1, visited))
            findPaths(maze, x, y + 1, visited, path + "R", paths);

        // Move Up (U)
        if (isSafe(maze, x - 1, y, visited))
            findPaths(maze, x - 1, y, visited, path + "U", paths);

        // Move Left (L)
        if (isSafe(maze, x, y - 1, visited))
            findPaths(maze, x, y - 1, visited, path + "L", paths);

        // Backtrack (unmark this cell)
        visited[x][y] = false;
    }

    // Wrapper function to find all paths
    static void solveMaze(int maze[][]) {
        N = maze.length;
        boolean visited[][] = new boolean[N][N];
        ArrayList<String> paths = new ArrayList<>();

        if (maze[0][0] == 1)  // Start only if the first cell is open
            findPaths(maze, 0, 0, visited, "", paths);

        // Print all paths
        if (paths.isEmpty())
            System.out.println("No path found!");
        else
            System.out.println("All possible paths: " + paths);
    }

    // Driver code
    public static void main(String args[]) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        solveMaze(maze);
    }
}

