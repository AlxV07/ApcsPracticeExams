package PracticeExam3;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    /*
    A toy collector is creating an inventory of her marble collection. A marble set specifies the color and
    number of a particular group of marbles from her collection. Declaration of the MarbleSet class is shown
    below. Method implementations are not shown.
     */
    class MarbleSet {
        public MarbleSet(String color, int numMarbles) {
        }

        public String getColor() {
            return "";
        }

        public int getNumber() {
            return 0;
        }
    }

    /*
    The MarbleCollection class documents all sets of marbles in the collection.
     */
    class MarbleCollection {
        private List<MarbleSet> sets;

        public MarbleCollection() {
            sets = new ArrayList<>();
        }

        public void addSet(MarbleSet set) {
            sets.add(set);
        }

        /*
        PART (A)
        Write the getTotalMarbles method which computes and returns the sum of the number of marbles.
        If there are no marble sets, the method returns 0.
         */
        public int getTotalMarbles() {
            int count = 0;
            for (MarbleSet mSet : sets) {
                count += mSet.getNumber();
            }
            return count;
        }

        /*
        PART (B)
        Write the method removeColor which removing all marble sets with the color specified by the
        parameter "marbleColor". The method returns the number of marbles removed.
         */
        public int removeColor(String marbleColor) {
            int ballsRemoved = 0;
            for (MarbleSet mSet: sets) {
                if (marbleColor.equalsIgnoreCase(mSet.getColor())) {
                    ballsRemoved += mSet.getNumber();
                    sets.remove(mSet);
                }
            }
            return ballsRemoved;
        }
    }
}
