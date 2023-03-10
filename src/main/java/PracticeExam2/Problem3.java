package PracticeExam2;

import java.util.ArrayList;

/*
    A factory keeps track of its printing machines in array machines, and it keeps track of its paper supply
    int two lists: newRolls and usedRolls. At the beginning of the day, usedRolls is emptied of all paper remnants and
    newRolls is refilled.
 */

public class Problem3 {
    class Machine {
        private PaperRoll paper;

        public Machine(PaperRoll paperRoll) {
            this.paper = paperRoll;
        }

        public PaperRoll getPaperRoll() {
            return this.paper;
        }
        // PART (A): Write the replacePaper method which takes a new PaperRoll as its parameters and returns the used roll.
        public PaperRoll replacePaper(PaperRoll paper) {
            PaperRoll old = this.paper;
            this.paper = paper;
            return old;
        }
    }

    class PaperRoll {
        private double meters;

        public PaperRoll() {
            this.meters = 1000;
        }

        public double getMeters() {
            return meters;
        }
    }

    class PrintingFactory {
        private Machine[] machines;

        private ArrayList<PaperRoll> newRolls = new ArrayList<>();

        private ArrayList<PaperRoll> usedRolls = new ArrayList<>();

        public PrintingFactory(int numMachines) {
            this.machines = new Machine[numMachines];
        }

        // PART (B) Write the replacePaperRolls method
        public void replacePaperRolls(PaperRoll roll) {
            for (Machine i : machines) {
                if (i.getPaperRoll().getMeters() < 4) {
                    usedRolls.add(i.replacePaper(newRolls.remove(0)));
                }
            }
        }

        // PART (C) Write the getPaperUsed method which calculates how much paper has been used by all machines.
        public double getPaperUsed() {
            double sum = 0;
            for (PaperRoll i : usedRolls) {
                sum += 1000 - i.getMeters();
            }
            for (Machine j : machines) {
                sum += 1000 - j.getPaperRoll().getMeters();
            }
            return sum;
        }
    }
}
