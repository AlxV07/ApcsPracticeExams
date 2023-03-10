package PracticeExam2;

import java.util.ArrayList;
import java.util.Random;

public class Problem4 {

    class GamePiece {
    }

    class HexGrid {
        private GamePiece[][] grid;

        // PART (A) Write the method getGamePieceCount; returns number of GamePiece objects in grid.
        public int getGamePieceCount() {
            int sum = 0;
            for (GamePiece[] gamePieces : grid) {
                for (GamePiece gamePiece : gamePieces) {
                    if (gamePiece != null) {
                        sum++;
                    }
                }
            }
            return sum;
        }

        /*
            PART (B) Write the method isAbove; returns ArrayList of GamePieces located "above" a GamePiece (if location
            specified by args is null, return null).
            "Above" is defined as in the same column but with a lower row number than the specified location.
         */
        public ArrayList<GamePiece> isAbove(int row, int col) {
            ArrayList<GamePiece> above = new ArrayList<>();
            if (grid[row][col] != null) {
                for (int i = 0; i < row - 1; i++) {
                    if (grid[i][col] != null) {
                        above.add(grid[i][col]);
                    }
                }
                return above;
            } else {
                return null;
            }
        }

        /*
            PART (C) Write the method addRandom which takes a parameter that represents the number of GamePieces
            to be added to the grid at random locations. GamePieces can can only be added to locations that are
            currently empty (null). Returns true if sufficient space is available to add GamePieces and Pieces
            are added successfully, else false.
         */

        public boolean addRandom(int number) {
            ArrayList<int[]> emptySpaces = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == null) {
                        emptySpaces.add(new int[]{i, j});
                    }
                }
            }
            if (number <= emptySpaces.size()) {
                Random random = new Random();
                for (int i = 0; i < number; i++) {
                    for (int j = 0; j < number; j++) {
                        int[] coords = emptySpaces.remove(random.nextInt(0, emptySpaces.size()));
                        grid[coords[0]][coords[1]] = new GamePiece();
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }
}