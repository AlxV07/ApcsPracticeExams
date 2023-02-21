import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem3Test{
    problem3 problem3;
    problem3 problem3number2;

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
        problem3 = new problem3(10, arrayList);
        problem3number2 = new problem3(5, arrayList2);
    }

    @Test
    public void checkGetTotalWeightCalculatesCorrectly() {
        assertEquals(19.613, problem3.getTotalWeight());
    }

    @Test
    public void removeExcessCars() {
        ArrayList<Double> removedCars = new ArrayList<>() {{add(9.613);}};
        ArrayList<Double> removedCars1 = new ArrayList<>() {{
            add(9.613);
            add(4.0);
            add(3.0);
        }};
        assertEquals(removedCars, problem3.removeExcessTrainCars());
        assertEquals(removedCars1, problem3number2.removeExcessTrainCars());
    }
}
