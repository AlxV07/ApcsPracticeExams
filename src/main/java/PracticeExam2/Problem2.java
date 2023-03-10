package PracticeExam2;

public class Problem2 {
    // Write the Quadratic class. Your implementation must include a constructor that has three double parameters that represent a, b, and c. It must also include a method getDiscriminant that calculates and returns the value of the discriminant, a method root1 and a method root2 that will calculate the possible two roots of the equation.


    public class Quadratic {
        double a, b, c;
        public Quadratic(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return (b*b)- (4*a*c);
        }

        public double root1() {
            return ((-1 * b) + Math.sqrt(getDiscriminant())) / (2 * a);
        }

        public double root2() {
            return ((-1 * b) - Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
}
