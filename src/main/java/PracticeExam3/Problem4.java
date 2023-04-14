package PracticeExam3;

public class Problem4 {
    /*
    The class Connect4 represents the popular checker game in which two players attempt to place
    four checker pieces in a straight line to win. The players moves are represented in a two-dimensional
    String array, using "B" for black moves and "W" for white ones.
     */

    class Connect4 {
        private final String[][] board;

        public Connect4(int rows, int cols) {
            /*
            PART (A)
            Write the constructor for the Connect4 class. The construct initializes the board instance variable
            to a two-dimensional array with the given number of rows and columns.
             */
            this.board = new String[rows][cols];
        }

        public boolean move(String color, int column) {
            /*
            PART (B)
            Write the move method for the Connect4 class which initializes an element in the board with the
            color provided by the parameter "color", at the lowest possible row of the specified column. Returns
            true if a color has been successfully assigned to the column, and false if not.
             */
            if (column < 0 || column >= board[0].length) {
                return false;
            }
            for (int y = 0, s = board.length; y < s; y++) {
                if (board[y][column] != null) {
                    if (y > 0) {
                        board[y][column] = color;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            board[board[0].length - 1][column] = color;
            return true;
        }

        public int checkVerticalWin(String color) {
            /*
            PART (C)
            Write the method checkVerticalWin which will check all columns to determine if there are four
            adjacent checkers of the specified color in any column. If so, the method will return the column
            containing those checkers. If four consecutive checkers of the specified color are not detected,
            the method will return -1.
             */
            for (int col = 0; col < board.length; col++) {
                int consecutives = 0;
                for (String s : board[col]) {
                    if (consecutives == 4) {
                        return col;
                    } else {
                        consecutives = (color.equalsIgnoreCase(s)) ? consecutives + 1 : 0;
                    }
                }
            }
            return -1;
        }
    }
}
