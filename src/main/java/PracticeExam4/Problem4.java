package PracticeExam4;

public class Problem4 {
    /*
    A city parking lot has a sign that keep track of how many parking spaces are available in the lot.

     */

    class Car {

    }

    class ParkingLot {
        private Car[][] lot;

        public ParkingLot(int rows, int cols) {
            lot = new Car[rows][cols];
        }

        public int openSpaces() {
            /*
            PART (A):
            Write the openSpaces method which returns the number of spaces available in the parking lot.
            A space is considered available if it is equal to null.
             */
            int count = 0;
            for (Car[] lane : lot) {
                for (Car c : lane) {
                    if (c != null) {
                        count++;
                    }
                }
            }
            return count;
        }

        public boolean parkCar(Car newCar) {
            /*
            PART (B):
            Write the parkCar method which inserts a new car in any empty space in the parking lot.
            Returns true if it was able to do so; otherwise, returns false.
             */
            if (openSpaces() > 1) {
                for (int i = 0; i < lot.length; i++) {
                    for (int j = 0; j < lot[i].length; j++) {
                        if (lot[i][j] == null) {
                            lot[i][j] = newCar;
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
