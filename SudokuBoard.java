import java.util.*;
import java.io.*;

public class SudokuBoard {
   private int[][] board;
   
   public SudokuBoard(String filename) {
      board = new int[9][9];
      try {
         Scanner file = new Scanner(new File(filename));
         
         for(int r = 0; r < 9; r++) {
            String line = file.nextLine();
            for(int c = 0; c < 9; c++) {
               Scanner lineScan = new Scanner(line);
               char num = lineScan.next().charAt(c);
               if(num == '.') {
                  board[r][c] = 0;
               }else {
                  board[r][c] = num - 48;
               }
            }
         }
         
      } catch(FileNotFoundException e) {
         System.out.println("Cannot load: " + filename);
      } catch(InputMismatchException e) {
         System.out.println(filename + " does not meet format expectations.");
      }
   }
   
   public String toString() {
      String build = " -----------------\n";
      for(int r = 0; r < board.length; r++) {
         build += "|\t";
         for(int c = 0; c < board[0].length; c++) {
            build += board[r][c] + "|\t";
         }
         build += "|\n";
      }
      build += " -----------------\n";
      return build;   
   }
}

/*
# PROGRAM OUTPUT

  ----jGRASP exec: java SudokuEngine
  -----------------
 |	50|	0|	0|	49|	0|	53|	0|	0|	51|	|
 |	0|	53|	52|	0|	0|	0|	55|	49|	0|	|
 |	0|	49|	0|	50|	0|	51|	0|	56|	0|	|
 |	54|	0|	50|	56|	0|	55|	51|	0|	52|	|
 |	0|	0|	0|	0|	0|	0|	0|	0|	0|	|
 |	49|	0|	53|	51|	0|	57|	56|	0|	54|	|
 |	0|	50|	0|	55|	0|	49|	0|	54|	0|	|
 |	0|	56|	49|	0|	0|	0|	50|	52|	0|	|
 |	55|	0|	0|	52|	0|	50|	0|	0|	49|	|
  -----------------
 
 
  ----jGRASP: Operation complete.

*/