public class Main_Class {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 20, 3.8);
        Student s2 = new Student(2, "Bob", 22, 3.6);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Student{
    int id;
    String name;
    int age;
    double gpa;

    Student(int id, String name, int age, double gpa){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    public String toString(){
        return "Student ID: "+id+" Name: "+name+" Age: "+age+" GPA: "+gpa;
    }
}