public class ClassesAndObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Bodhisattva";
        student1.rollno = 64;
        student1.marks = 95;
        
        System.out.println(student1.name);
        System.out.println(student1.rollno);
        System.out.println(student1.marks);
    }
}
class Student {
    String name;
    int rollno;
    int marks;
}
