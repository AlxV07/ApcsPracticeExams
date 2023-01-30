import java.util.ArrayList;

public class problem3a {
    /*
    Write a method called getTotalWeight, which
    will calculate the total weight of the train
    by adding the weight of each of the train
    cars to the weight of the engine.
     */

    ArrayList<Double> trainCars= new ArrayList<>();

    //All above this line are provided by the test.

    public double getTotalWeight() {
        double a = 0;
        for (Double i : trainCars)
            a +=i;
        return a;
    }
}
