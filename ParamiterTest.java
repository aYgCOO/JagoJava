import java.util.Scanner;

class ParamiterTest {
    private String Student;
    private int age;
    public ParamiterTest(){
        String Student = "Unknown";
        int age = 0;
        System.out.println("This is a default constructor");
    }
    public ParamiterTest(String Student, int age){
        this.Student = Student;
        this.age = age;
        System.out.println("This is a parameterized constructor ");

    }
    public void Displayinfo(){
        System.out.println("Student name: "+Student);
        System.out.println("Age: "+age);
    }
    public static void main(String arg[]){
        ParamiterTest defaultcons = new ParamiterTest();
        ParamiterTest paramitarcons = new ParamiterTest("Ayanabha Chatterjee", 19);
        defaultcons.Displayinfo();
        paramitarcons.Displayinfo();
    }
}