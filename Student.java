public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String course;

    public Student(int rollNumber, String name, int age, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void displayDetails() {
        System.out.println("Roll No.: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }
}
