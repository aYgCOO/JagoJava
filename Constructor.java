import java.util.*;
public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInfo();
        Student student2 = new Student("Ayanabha", 19);
        student2.displayInfo("College: Graduation");
    }
}
