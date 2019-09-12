package Stu;

public class Student {
    String firstName;
    String lastName;
    String studentNumber;

    public Student(){

    }

    public Student(String firstName, String lastName, String studentNumber){

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

    public String getStudentNumber() {
        return studentNumber;
    }

}
