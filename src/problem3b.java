import java.util.ArrayList;

public class problem3b {
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

    ArrayList<Double> trainCars = new ArrayList<>();

    public static double getMaximumWeight() {return 0;}
    problem3a getTotalWeight = new problem3a();

    // All above this line are provided by the test.

    public ArrayList<Double> removeExcessTrainCars() {
        ArrayList<Double> a = new ArrayList<>();
        double b = getTotalWeight.getTotalWeight();
        while(b > getMaximumWeight()) {
            a.add(trainCars.get(trainCars.size()-1));
            trainCars.remove(trainCars.size()-1);
            b = getTotalWeight.getTotalWeight();
        }
        return a;
    }
}
