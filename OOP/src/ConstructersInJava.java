public class ConstructersInJava {
    public static void main(String[] args) {
        StudentDetails bodhisattva = new StudentDetails(564, "Bodhisattva", 90.4);
        
        System.out.println(bodhisattva.roll);
        System.out.println(bodhisattva.name);
        System.out.println(bodhisattva.marks);
        StudentDetails rahul = new StudentDetails(6666, "Rahul", 85.4);
        StudentDetails rahul2 = new StudentDetails(666, "KJS Rahul");
        System.out.println(rahul.roll);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
        rahul.changeName("K.J.S Rahul");
        System.out.println(rahul.name);
        System.out.println(rahul2.name);

        StudentDetails kunal = new StudentDetails(rahul);
        System.out.println(kunal.roll);
        System.out.println(kunal.marks);
        System.out.println(kunal.name);
        StudentDetails kunalkushwaha = new StudentDetails();
        System.out.println(kunalkushwaha.roll);
        System.out.println(kunalkushwaha.name);
        System.out.println(kunalkushwaha.marks);
    }
}
class StudentDetails {
    int roll;
    String name;
    double marks;

    void changeName(String newName){
        this.name = newName;
    }

    StudentDetails(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    // Constructor Overloading

    StudentDetails(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    
    // Copy Constructor

    StudentDetails(StudentDetails otherObject){
        this.roll = otherObject.roll;
        this.name = otherObject.name;
        this.marks = otherObject.marks;
    }


    // Constructor chaining

    StudentDetails(){
        this(13, "Kunal", 93.4);
    }
}