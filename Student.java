public class Student {
    private String name;
    private int age;

    // Corrected the constructor name
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Corrected the constructor name and removed void
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name:" + name + " Age:" + age + " ");
    }

    public void displayInfo(String additionalInfo) {
        System.out.println("Name:" + name + " Age:" + age + " " + additionalInfo);
    }
}
