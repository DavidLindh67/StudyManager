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
        System.out.printf("Poäng %s%n", points);
    }
}
