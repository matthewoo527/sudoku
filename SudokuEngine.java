public class SudokuEngine {
    public static void main(String[] args) {
        SudokuBoard myBoard = new SudokuBoard("data1.sdk");
        System.out.println(myBoard);
    }
}

/*
# PROGRAM OUTPUT

  ----jGRASP exec: java SudokuEngine
  -----------------
 |	2|	0|	0|	1|	0|	5|	0|	0|	3|	|
 |	0|	5|	4|	0|	0|	0|	7|	1|	0|	|
 |	0|	1|	0|	2|	0|	3|	0|	8|	0|	|
 |	6|	0|	2|	8|	0|	7|	3|	0|	4|	|
 |	0|	0|	0|	0|	0|	0|	0|	0|	0|	|
 |	1|	0|	5|	3|	0|	9|	8|	0|	6|	|
 |	0|	2|	0|	7|	0|	1|	0|	6|	0|	|
 |	0|	8|	1|	0|	0|	0|	2|	4|	0|	|
 |	7|	0|	0|	4|	0|	2|	0|	0|	1|	|
  -----------------
 
 
  ----jGRASP: Operation complete.

*/