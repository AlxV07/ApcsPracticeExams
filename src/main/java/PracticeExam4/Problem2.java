package PracticeExam4;

public class Problem2 {
    /*
    A baseball team consists of different people including players, coaches, and people who work in the front office
    making trades and other transactions. The following Person class is used for all people who work for the team.
     */

    public class Person {
        private String fullName;
        private int age;

        public Person(String s, int a) {
            fullName = s;
            age = a;
        }

        public String getName() {
            return fullName;
        }

        public int getAge() {
            return age;
        }
    }

    /*
    A player has a name and age just like any person on the team, but also has a "position". The position could be
    something like "catcher", "left-fielder", or "infielder". Players should also be able to change their positions
    using a method called changePosition. Here is an example of a Player object in use:

    Player p = new Player("Sammy Sosa", 32, "right fielder");
    p.changePosition("outfielder");

    Write the entire Player class.
     */

    public class Player extends Person {
        private String position;

        public Player(String fullName, int age, String position) {
            super(fullName, age);
            this.position = position;
        }

        public String getPosition() {
            return position;
        }

        public void changePosition(String position) {
            this.position = position;
        }
    }
}
