public class Course {
    private String name;
    private String teacher;
    private int points;

    public Course(String name, String teacher, int points) {
        this.name = name;
        this.teacher = teacher;
        this.points = points;
    }

    public void printInfo() {
        System.out.printf("Kurs: %s%n", name);
        System.out.printf("Lärare: %s%n", teacher);
        System.out.printf("Poäng %d%n", points);
    }

    /**
     * A method to change points variable.
     * This also includes an if the amount you changes to is 0 or more.
     * @param changePoints The variable that the user input to the system.
     */

    public void pointChanger(int changePoints) {
        if (changePoints >= 0) {
            points = changePoints;
        } else System.out.println("Ogiltig mängd");
    }

    /**
     * A method to change name variable.
     * @param nameChange The variable that the user writes into the system.
     */

    public void nameChanger(String nameChange) {
        name = nameChange;
    }

    /**
     * A method to change value of teacher variable.
     * @param teacherChange What the user writes down into the scanner.
     */

    public void teacherChanger(String teacherChange) {
        teacher = teacherChange;
    }
}
