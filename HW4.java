import java.util.*;

public class HW4 {

   // Returns true if it is possible to solve the maze,
   // starting in the top-left and ending in the bottom-right.
   public static boolean winnable(int maze[][]) {
      boolean marked[][] = new boolean[maze.length][maze[0].length];
      return winnable(maze, 0, 0, marked);
   }

   // Returns true if it is possible to solve the maze,
   // starting in the location maze[startRow][startCol] and ending in the bottom-right.
   // If the maze is winnable, this method modifies the maze array by filling in the winning path with 2s.
   // Otherwise, the maze is not modified.
   public static boolean winnable(int maze[][], int startRow, int startCol, boolean[][] marked) {
      int numRows = maze.length, numCols = maze[0].length;
      
      // If you already won, fill in the entry with 2 and return true.
      // Mark the current location as visited.
      // Call winnable recursively on each adjacent location that hasn't been visited yet.
      // (do not visit invalid locations, i.e. locations that contain walls or locations outside the maze)
      // If you can win from any adjacent location, fill in the entry with 2 and return true.
      // Otherwise return false.
   }
   
   public static void print(int maze[][]) {
      for (int[] row : maze)
         System.out.println(Arrays.toString(row));
   }

   public static void main(String[] args) {
      int[][] maze1 = {{0, 0, 0, 1, 1},
                       {1, 1, 0, 1, 1},
                       {0, 0, 0, 1, 1},
                       {0, 1, 1, 1, 1},
                       {0, 0, 0, 0, 0}};

      int[][] maze2 = {{0, 0, 0, 0, 1},
                       {0, 1, 0, 1, 1},
                       {0, 1, 1, 0, 0},
                       {0, 0, 0, 1, 0},
                       {1, 0, 1, 0, 0}};

      int[][] maze3 = {{0, 0, 0, 0, 1},
                       {0, 1, 1, 0, 1},
                       {0, 1, 1, 0, 1},
                       {0, 0, 1, 1, 1},
                       {1, 0, 0, 0, 0}};

      int[][] maze4 = {{0, 1, 0, 0, 0},
                       {0, 1, 0, 1, 0},
                       {0, 0, 1, 0, 0},
                       {0, 1, 0, 1, 0},
                       {0, 0, 0, 1, 0}};
      
      int[][] maze5 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
      
      // For each maze, call the winnable method, then print the maze.
      // Winnable mazes should have their winning paths filled in with 2s.
      
      System.out.println("maze1: " + winnable(maze1)); // true
      print(maze1);
      
      System.out.println("\nmaze2: " + winnable(maze2)); // false
      print(maze2);
      
      System.out.println("\nmaze3: " + winnable(maze3)); // true
      print(maze3);
      
      System.out.println("\nmaze4: " + winnable(maze4)); // false
      print(maze4);
      
      System.out.println("\nmaze5: " + winnable(maze5)); // true
      print(maze5);
   }
}