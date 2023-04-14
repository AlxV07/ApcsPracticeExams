package PracticeExam3;

public class Problem2 {
    /*
    Write a class Parabola which  takes 3 integer parameters that represent "a", "b", and "c" successively.
    You may assume as a precondition that "a" is a non-zero integer.
    You must write two methods:
        - getAxis which returns the x-coordinate of the axis of symmetry as a double.
        - isOnGraph method that takes a point represented by two integer parameters, "x" and "y", and returns true if
          the point is on the Parabola and returns false if not.
     */
    class Parabola {
        private final int a, b, c;
        public Parabola(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getAxis() {
            return (double) -b / (2 * a);
        }

        public boolean isOnGraph(int x, int y) {
            return y == (a * x * x) + (b * x) + c;
        }
    }
}
