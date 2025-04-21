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
                  board[r][c] = num;
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
      return "";      
   }
}