package PracticeExam4;

import java.util.ArrayList;

public class Problem1 {
    /*
    A day care has a program to keep track of its employees and which children they teach during the day.
    An Employee has a minimum and maximum age they can teach.
    The DayCare also has a maximum ratio that specifies the maximum number of children a single employee can teach.
    Below is the DayCare, Employee, and Child classes (method implementations not shown):
     */
    class Employee {
        public int childrenAssigned() {
            return 0;
        }

        public void assignChild(Child c) {
        }

        public boolean canTeach(int age) {
            return false;
        }
    }

    class Child {
        public String getName() {
            return "";
        }

        public int getAge() {
            return 0;
        }
    }

    class DayCare {
        private ArrayList<Employee> employees;
        private ArrayList<Child> children;
        private int maxRatio;

        public DayCare(int maxRatio) {
            employees = new ArrayList<>();
            children = new ArrayList<>();
            this.maxRatio = maxRatio;
        }

        public boolean findEmployeeForChild(Child c) {
            /*
            PART (A):
            An Employee can only teach children between the minimum age (inclusive) & maximum age (inclusive).
            They can also only teach children up to the day care's maximum ratio (inclusive).
            Write the method findEmployeeForChild which assigns a Child to the first Employee that can teach the child.
            Return true if an Employee was assigned; otherwise return false.
             */
            Employee e = employeeAvailable(c);
            if (e == null) {
                return false;
            } else {
                e.assignChild(c);
                return true;
            }
        }

        public boolean runDayCare() {
            /*
            PART (B):
            In order for the DayCare to run for a day, each Child must be assigned an Employee.
            If an Employee cannot be found for a child, the DayCare cannot run for the day.
            Complete the runDayCare method that finds an Employee for each Child in the ArrayList "children".
            Return true if an Employee was found for every child; otherwise, return false.
             */
            for (Child c : children) {
                if (!findEmployeeForChild(c)) {
                    return false;
                }
            }
            return true;
        }

        public boolean addChild(Child c) {
            /*
            PART (C):
            When a Child is added to the roster of the DayCare, the DayCare should first make sure there is an
            Employee available to teach that Child.
            Write the addChild method below that adds a Child to the "children" ArrayList if an Employee is available.
            Returns true if the Child was added to "children", otherwise returns false.
             */
            if (employeeAvailable(c) == null) {
                return false;
            } else {
                children.add(c);
                return true;
            }
        }

        // Own Method
        private Employee employeeAvailable(Child c) {
            for (Employee e : employees) {
                if (e.childrenAssigned() < maxRatio && e.canTeach(c.getAge())) {
                    return e;
                }
            }
            return null;
        }
    }
}
