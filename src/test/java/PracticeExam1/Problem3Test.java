package PracticeExam1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Problem3Test{
    Problem3 problem3;
    Problem3 problem3Number2;

    @BeforeEach
    public void setup() {
        ArrayList<Double> arrayList = new ArrayList<>() {{
            add(1.0);
            add(2.0);
            add(3.0);
            add(4.0);
            add(9.613);
        }};
        ArrayList<Double> arrayList2 = new ArrayList<>() {{
            add(1.0);
            add(2.0);
            add(3.0);
            add(4.0);
            add(9.613);
        }};
        problem3 = new Problem3(10, arrayList);
        problem3Number2 = new Problem3(5, arrayList2);
    }

    @Test
    public void checkGetTotalWeightCalculatesCorrectly() {
        Assertions.assertEquals(19.613, problem3.getTotalWeight());
    }

    @Test
    public void removeExcessCars() {
        ArrayList<Double> removedCars = new ArrayList<>() {{add(9.613);}};
        ArrayList<Double> removedCars1 = new ArrayList<>() {{
            add(9.613);
            add(4.0);
            add(3.0);
        }};
        Assertions.assertEquals(removedCars, problem3.removeExcessTrainCars());
        Assertions.assertEquals(removedCars1, problem3Number2.removeExcessTrainCars());
    }
}
