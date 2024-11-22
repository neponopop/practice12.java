package practice12;

public class Student {
    private final String name;
    private final double currentScholarship;
    private final double newScholarship;

    public Student(String name, double currentScholarship, double newScholarship) {
        this.name = name;
        this.currentScholarship = currentScholarship;
        this.newScholarship = newScholarship;
    }

    public String getName() {
        return name;
    }

    public double getCurrentScholarship() {
        return currentScholarship;
    }

    public double getNewScholarship() {
        return newScholarship;
    }

    public double getScholarshipIncrease() {
        return newScholarship - currentScholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", currentScholarship=" + currentScholarship +
                ", newScholarship=" + newScholarship +
                ", scholarshipIncrease=" + getScholarshipIncrease() +
                '}';
    }
}
