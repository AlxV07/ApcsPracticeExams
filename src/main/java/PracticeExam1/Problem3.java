package PracticeExam1;

import java.util.ArrayList;

public class Problem3 {
    /*
    Write a method called removeExcessTrainCars
    which removes Double objects, one at a time,
    from the end of the train until the weight
    is less than or equal to the maximum weight
    allowed, as given by the getMaximumWeight.
    The removed train cars are added to the end
    of an ArrayList of Double objects as they
    are removed. This ArrayList is returned by
    removeExcessTrainCars.
     */

    ArrayList<Double> trainCars;
    double maximumWeight;

    public double getMaximumWeight() {return maximumWeight;}

    // All above this line are provided by the test.

    public Problem3(double maximumWeight, ArrayList<Double> trainCars) {
        this.maximumWeight = maximumWeight;
        this.trainCars = trainCars;
    }

    public double getTotalWeight() {
        double a = 0;
        for (Double i : trainCars)
            a +=i;
        return a;
    }

    public ArrayList<Double> removeExcessTrainCars() {
        ArrayList<Double> a = new ArrayList<>();
        double b = getTotalWeight();
        while(b > getMaximumWeight()) {
            a.add(trainCars.get(trainCars.size()-1));
            trainCars.remove(trainCars.size()-1);
            b = getTotalWeight();
        }
        return a;
    }
}
