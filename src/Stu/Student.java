package Stu;

public class Student {
    String firstName;
    String lastName;
    int studentNumber;

    public Student(){

    }

    public Student(String firstName, String lastName, int studentNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

}
